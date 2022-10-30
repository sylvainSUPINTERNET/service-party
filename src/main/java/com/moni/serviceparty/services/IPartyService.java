package com.moni.serviceparty.services;

import org.springframework.stereotype.Service;

import com.moni.serviceparty.documents.Party;

import reactor.core.publisher.Flux;

@Service
public interface IPartyService {
    public Flux<Party> getAllParties();
}
