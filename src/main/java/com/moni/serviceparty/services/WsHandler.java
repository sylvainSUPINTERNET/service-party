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

                    // session.send(Mono.just(session.textMessage("Hello " + session.getId()))).subscribe(
                    //         data -> logger.info("data send msg", data), // onNext
                    //         err -> logger.error(err.getMessage()),  // onError
                    //         () -> logger.info("Message send to " + session.getId() + "with success") // onComplete
                    // );
            
                })
                .doOnComplete(() -> logger.info("Server -> client disconnected id=[{}]", session.getId()))
                .then();
    }
    
}
