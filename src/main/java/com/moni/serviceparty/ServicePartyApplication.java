package com.moni.serviceparty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class ServicePartyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicePartyApplication.class, args);
	}

}
