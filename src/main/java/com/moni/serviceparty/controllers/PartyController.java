package com.moni.serviceparty.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moni.serviceparty.services.IPartyService;

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

}
