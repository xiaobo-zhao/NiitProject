package com.example.demo.configure;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/commodity/file/**").addResourceLocations("file:"+"D:/final_project/vue3_test/src/assets/images/");
        registry.addResourceHandler("/file/**").addResourceLocations("file:D:/images/");
    }
}
