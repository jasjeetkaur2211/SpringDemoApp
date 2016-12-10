package com.springapp.api.config;

/**
 * Created by kaushik on 29-Nov-16.
 */

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.springapp.controllers")
public class DispatcherServletConfiguration {
    @Bean
    ViewResolver setupViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();

        resolver.setPrefix("/WEB-INF/pages/");
//        resolver.setSuffix(".jsp");

        resolver.setSuffix(".html");
        return resolver;
    }

}