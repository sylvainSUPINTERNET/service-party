package com.moni.serviceparty.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.HandlerMapping;
import org.springframework.web.reactive.handler.SimpleUrlHandlerMapping;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.server.support.WebSocketHandlerAdapter;

import java.util.HashMap;
import java.util.Map;

import com.moni.serviceparty.services.WsHandler;

@Configuration
public class WsConfig {
    
    private String path = "/test";

    @Bean
    public WsHandler serverHandler() {
        return new WsHandler();
    }

    @Bean
    public HandlerMapping handlerMapping(WsHandler serverHandler) {
        Map<String, WebSocketHandler> handlerByPathMap = new HashMap<>();
        handlerByPathMap.put(this.path, serverHandler);

        SimpleUrlHandlerMapping handlerMapping = new SimpleUrlHandlerMapping();
        handlerMapping.setUrlMap(handlerByPathMap);
        handlerMapping.setOrder(-1);

        return handlerMapping;
    }

    @Bean
    public WebSocketHandlerAdapter handlerAdapter() {
        return new WebSocketHandlerAdapter();
    }
}
