package com.lmyxlf.jian_mu.global.interceptor;

import com.lmyxlf.jian_mu.global.session.SessionBindInfo;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lmy
 * @email 2130546401@qq.com
 * @date 2024/7/8 13:05
 * @description SpringMvc 拦截器
 * 绑定一些初始参数
 * @since 17
 */
public class SpringMvcSessionBindInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        SessionBindInfo.initInfo();
        return true;
    }
}