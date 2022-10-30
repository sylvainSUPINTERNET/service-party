package com.moni.serviceparty.services;

import org.springframework.stereotype.Service;

import com.moni.serviceparty.documents.Party;
import com.moni.serviceparty.dto.PartyCreateDto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public interface IPartyService {
    public Flux<Party> getAllParties();
    public Mono<Party> addPartyFromAdmin(PartyCreateDto party);
}
