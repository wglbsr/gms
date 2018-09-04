package com.dyny.gms.interceptor;

import com.dyny.gms.utils.EhcacheUtil;
import org.apache.log4j.Logger;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.util.Set;

/**
 * 登陆拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

    private static Logger logger = Logger.getLogger(LoginInterceptor.class);
    public static String LOGIN_CACHE_NAME = "loginInfo";
    public static String TOKEN_NAME = "token";

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
        //过滤掉登陆操作的token判断
//        String method = request.getRequestURI();
//        logger.info("executed method:" + method);
//        int identity = Integer.valueOf(request.getParameter("id"));
//        String token = request.getParameter(TOKEN_NAME);
//        EhcacheUtil ehcacheUtil = EhcacheUtil.getInstance();
//        Cache ca1 = ehcacheUtil.get(LOGIN_CACHE_NAME);
//        if (ca1.isElementInMemory(token)) {
//            Element ele = ca1.get(token);
//            logger.info("已存在!identity:" + ele.getObjectValue());
//        } else {
//            Element element = new Element(token, identity);
//            ca1.put(element);
//            logger.info("插入到缓存!");
//        }

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
//        if (modelAndView == null) {
//            logger.info("modelAndView is null");
//        }else{
//            ModelMap modelMap = modelAndView.getModelMap();
//            modelAndView.getModel();
//            Set<String> keySet = modelMap.keySet();
//            for (String key : keySet) {
//                logger.info(key + ":" + modelMap.get(key));
//            }
//        }
//
//       OutputStream op =  response.getOutputStream();
//

//        logger.info("modelAndView is null");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
