package com.moni.serviceparty.repositories;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import com.moni.serviceparty.documents.Party;

public interface IPartyRepository extends ReactiveMongoRepository<Party, String> {
    
}
