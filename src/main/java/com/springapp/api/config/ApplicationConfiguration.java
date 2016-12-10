package com.springapp.api.config;

/**
 * Created by kaushik on 29-Nov-16.
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.config.annotation.ContentNegotiationConfigurer;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
public class ApplicationConfiguration extends WebMvcConfigurerAdapter  {
    @Override
    public void configureContentNegotiation(ContentNegotiationConfigurer configurer) {
        configurer.defaultContentType(MediaType.APPLICATION_JSON).mediaType(".html",MediaType.ALL);
        // setting the default output of content as json here and also allowing mediaType .html.
    }

    @Override
    public void  addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("/pages/**").addResourceLocations("/WEB-INF/pages/");
        registry.addResourceHandler("/resources/**")
                .addResourceLocations("/resources/");
    }
}