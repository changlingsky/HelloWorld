package com.cskaoyan.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*
* 注解配置
* */
@WebFilter(urlPatterns = "/*")
public class HelloFilter1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter1 init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter1");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {

    }
}
