package com.dyny.gms.controller.interceptor;

import com.dyny.gms.db.pojo.LoginHistory;
import com.dyny.gms.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * 登陆拦截器
 */
public class CustomInterceptor implements HandlerInterceptor {
    @Value("${system.config.demo.level}")
    private int DEMO_LEVEL;
    private static Logger logger = Logger.getLogger(CustomInterceptor.class);
    public static String LOGIN_CACHE_NAME = "loginInfo";
    public static String TOKEN_NAME = "token";

    @Autowired
    UserService userService;

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
        if (uri.equals("Login") || uri.equals("login") || uri.equals("/ems/users/login.do")) {
            String username = request.getParameter("username");
            String ip = request.getRemoteAddr();
            LoginHistory loginHistory = new LoginHistory();
            loginHistory.setIp(ip);
            loginHistory.setUsername(username);
            loginHistory.setCreateTime(new Date());
            userService.saveLoginLog(loginHistory);
            logger.info("login username:" + username);
        } else {
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

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}