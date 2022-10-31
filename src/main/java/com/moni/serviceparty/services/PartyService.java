package com.moni.serviceparty.services;

import java.time.format.DateTimeFormatter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.moni.serviceparty.documents.Party;
import com.moni.serviceparty.dto.PartyCreateDto;
import com.moni.serviceparty.repositories.IPartyRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PartyService implements IPartyService {
    
    private Logger logger = LoggerFactory.getLogger(PartyService.class);
        
    private IPartyRepository partyRepository;

    public PartyService(IPartyRepository partyRepository) {
        this.partyRepository = partyRepository;
    }


    @Override
    public Flux<Party> getAllParties() {
        return this.partyRepository.findAll();
    }


    @Override
    public Mono<Party> addPartyFromAdmin(PartyCreateDto partyCreateDto) {
        try {
            Party party = new Party();
            party.setCurrentParticipants(0);
            party.setEndDate(partyCreateDto.getEndDate()); // DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(partyCreateDto.getEndDate());
            party.setStartDate(partyCreateDto.getStartDate());
            party.setEntryPrice(partyCreateDto.getEntryPrice());
            party.setItemToWinId(partyCreateDto.getItemToWinId());
            party.setMaxParticipants(partyCreateDto.getMaxParticipants());
            return this.partyRepository.save(party);
        } catch ( Exception e ) {
            this.logger.error("Error while creating new party", e);
            return Mono.from(null);
        }
 
    }


}
