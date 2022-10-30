package com.moni.serviceparty.services;

import org.springframework.stereotype.Service;

import com.moni.serviceparty.documents.Party;
import com.moni.serviceparty.repositories.IPartyRepository;

import reactor.core.publisher.Flux;

@Service
public class PartyService implements IPartyService {
    
    private IPartyRepository partyRepository;

    public PartyService(IPartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }


    @Override
    public Flux<Party> getAllParties() {
        return this.partyRepository.findAll();
    }


}
