package com.moni.serviceparty.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.CorsRegistry;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;


@Configuration
@EnableWebFlux
public class CorsConfig implements WebFluxConfigurer {
    
    @Value("${cors.allowedOrigin}")
    private String allowedOrigin;

    
    @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
        .allowedOrigins(allowedOrigin)
        .allowedMethods("*")
        .allowedHeaders("*")
        .allowCredentials(true);
    }
}
