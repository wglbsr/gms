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

import javax.print.DocFlavor;
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
    private static String MOBILE_DEVICE_iPhone = "iphone";
    private static String MOBILE_DEVICE_iPad = "ipad";
    private static String MOBILE_DEVICE_Android = "android";
    private static String MOBILE_DEVICE_Linux = "linux";
    private static String PC_DEVICE_Mac = "macintosh";
    private static String PC_DEVICE_Win = "windows";
    private static String PC_DEVICE_Lux = "linux";
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
        String token = request.getParameter(UserService.TOKEN_NAME);
        String userAgent = request.getHeader("User-Agent");
        String deviceType = "未知";
        //判断设配类型
        if (!StringUtils.isEmpty(userAgent)) {
            userAgent = userAgent.toLowerCase();
            if (userAgent.contains(MOBILE_DEVICE_iPhone)) {
                deviceType = MOBILE_DEVICE_iPhone;
            } else if (userAgent.contains(MOBILE_DEVICE_iPad)) {
                deviceType = MOBILE_DEVICE_iPad;
            } else if (userAgent.contains(MOBILE_DEVICE_Android)) {
                deviceType = MOBILE_DEVICE_Android;
            } else if (userAgent.contains(PC_DEVICE_Lux)) {
                deviceType = PC_DEVICE_Lux;
            } else if (userAgent.contains(PC_DEVICE_Win)) {
                deviceType = PC_DEVICE_Win;
            } else if (userAgent.contains(PC_DEVICE_Mac)) {
                deviceType = PC_DEVICE_Mac;
            }
        }
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
//            if (!cacheDao.contains(token)) {
//                return false;
//            }
            if (!StringUtils.isEmpty(token)) {
                cacheDao.updateTimeout(token, loginTimeout, TimeUnit.MINUTES);
            }
            logger.info("device:" + deviceType + " , URI:" + uri);
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
