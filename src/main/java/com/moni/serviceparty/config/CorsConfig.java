package com.moni.serviceparty.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsConfigurationSource;
import org.springframework.web.cors.reactive.CorsWebFilter;

@Configuration
public class CorsConfig {
    // TODO 

    
    // @Value("${cors.allowedOrigin}")
    // private String allowedOrigin;

    // @Bean
    // CorsWebFilter corsFilter() {

    //     CorsConfiguration config = new CorsConfiguration();

    //     config.setAllowCredentials(true);
    //     config.addAllowedOrigin(allowedOrigin);
    //     config.addAllowedHeader("*");
    //     config.addAllowedMethod("*");

    //     UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    //     source.registerCorsConfiguration("/**", config);

    //     return new CorsWebFilter((CorsConfigurationSource) source);
    // }
}
