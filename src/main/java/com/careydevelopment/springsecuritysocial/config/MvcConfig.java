package com.careydevelopment.springsecuritysocial.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/socialloginhome").setViewName("socialloginhome");
        registry.addViewController("/").setViewName("socialloginhome");
        registry.addViewController("/socialloginsuccess").setViewName("socialloginsuccess");
        registry.addViewController("/sociallogin").setViewName("sociallogin");
    }

}
