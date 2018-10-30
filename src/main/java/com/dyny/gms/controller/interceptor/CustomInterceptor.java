package com.dyny.gms.controller.interceptor;

import com.dyny.gms.db.cachce.CacheDao;
import com.dyny.gms.db.pojo.LoginHistory;
import com.dyny.gms.db.pojo.User;
import com.dyny.gms.service.UserService;
import com.dyny.gms.utils.CommonUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.DigestUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * 登陆拦截器
 */
public class CustomInterceptor implements HandlerInterceptor {
    @Value("${system.config.demo.level}")
    private int DEMO_LEVEL;
    private static Logger logger = Logger.getLogger(CustomInterceptor.class);

    @Autowired
    private UserService userService;
    @Autowired
    private CacheDao cacheDao;
    @Value("${system.login.timeout}")
    private int loginTimeout;

    /**
     * 1.是否已登录
     * 2.刷新token
     * 3.参数是否合法
     * 4.权限控制
     * 5.ip地址
     * 6.访问次数限制(或者黑名单)
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {


        String uri = request.getRequestURI();

        //记录登陆信息
        if (CommonUtil.String.equalsOne(uri, "login", "Login", "/ems/users/login.do")) {
            String username = request.getParameter("username");
            String ip = this.getActualIp(request);
            LoginHistory loginHistory = new LoginHistory();
            loginHistory.setIp(ip);
            loginHistory.setUsername(username);
            loginHistory.setCreateTime(new Date());
            userService.saveLoginLog(loginHistory);
            logger.info("login username:" + username);
        } else {
            //更新超时
            String token = request.getHeader(UserService.TOKEN_NAME);
            if (!StringUtils.isEmpty(token)) {
                cacheDao.updateTimeout(token, loginTimeout, TimeUnit.MINUTES);
            }
            logger.info("request uri:" + uri);
        }


        //允许跨域请求
        String origin = request.getHeader("Origin");
        response.setHeader("Access-Control-Allow-Origin", origin != null && !origin.isEmpty() ? "*" : origin);
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT, PATCH");
        response.setHeader("Access-Control-Max-Age", "0");
        response.setHeader("Access-Control-Allow-Headers", "Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("XDomainRequestAllowed", "1");
        return true;
    }


    /**
     * 获取真实ip地址
     *
     * @param request
     * @return
     */
    private String getActualIp(HttpServletRequest request) {
        String ip = request.getHeader("x-forwarded-for");
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("Proxy-Client-IP");
        }
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getHeader("WL-Proxy-Client-IP");
        }
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return StringUtils.isEmpty(ip) ? "unknown" : ip;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
