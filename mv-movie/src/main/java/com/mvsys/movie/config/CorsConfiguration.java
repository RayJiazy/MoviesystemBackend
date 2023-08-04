package com.mvsys.movie.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**")  // 对所有的请求都可以进行跨域设置
                        .allowedOrigins("*")  // 允许任何域名使用
                        .allowedMethods("*")  // 允许任何方法（post、get等）
                        .allowedHeaders("*");  // 允许任何请求头
            }
        };
    }
}

