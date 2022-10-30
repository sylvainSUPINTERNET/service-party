package com.moni.serviceparty.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moni.serviceparty.dto.PartyCreateDto;
import com.moni.serviceparty.services.IPartyService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/party")
public class PartyController {

    IPartyService partyService;

    public PartyController(IPartyService partyService) {
        this.partyService = partyService;
    }


    @GetMapping
    public Mono<ResponseEntity<?>> getAllParties() {
        return this.partyService.getAllParties()
            .collectList()
            .map(ResponseEntity::ok);
    }

    @PostMapping
    public Mono<ResponseEntity<?>> addPartyFromAdmin(@RequestBody PartyCreateDto party) {
        return this.partyService
            .addPartyFromAdmin(party)
            .map( e -> e != null ? ResponseEntity.ok(e) : ResponseEntity.badRequest().build());
    }


    // TODO 
    // Add party ( admin only )
    // -> event scheduler ( mongoDB )
    // When party is over => send event to rabbitmq ( to notify service history ) will send to WS
    // Join party ( user )
    // -> check if user has enough money ? ( require payment service )

}
