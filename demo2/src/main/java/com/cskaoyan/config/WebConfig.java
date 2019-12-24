package com.cskaoyan.config;

import com.cskaoyan.web.HelloFilter2;
import com.cskaoyan.web.HelloServlet2;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.ArrayList;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Bean
    public ServletRegistrationBean registrationBean(){
        return new ServletRegistrationBean(new HelloServlet2(),"/hello/servlet2");
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new HelloFilter2());
        ArrayList<String> urlPatterns = new ArrayList<>();
        urlPatterns.add("/*");
        filterRegistrationBean.setUrlPatterns(urlPatterns);
        return filterRegistrationBean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {

    }
}
