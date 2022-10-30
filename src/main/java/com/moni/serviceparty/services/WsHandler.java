package com.moni.serviceparty.services;
import org.springframework.web.reactive.socket.WebSocketHandler;
import org.springframework.web.reactive.socket.WebSocketSession;
import reactor.core.publisher.Mono;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WsHandler implements WebSocketHandler {

    private final Logger logger = LoggerFactory.getLogger(WsHandler.class);

    @Override
    public Mono<Void> handle(WebSocketSession session) {
        return session
                .receive()
                .doOnNext(message -> {
                    logger.info("Server -> client connected id=[{}]", session.getId());
                })
                .then();
    }
    
}
