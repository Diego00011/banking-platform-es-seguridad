package com.acme.banking.platform;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@OpenAPIDefinition(servers = {@Server(url = "/", description = "Default Server URL")})
@EntityScan(basePackages = {
"org.axonframework.eventsourcing.eventstore.jpa",
"org.axonframework.eventhandling.tokenstore.jpa",
"org.axonframework.modelling.saga.repository.jpa",
"com.acme.banking.platform"
})
@SpringBootApplication
public class BankingPlatformEsApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingPlatformEsApplication.class, args);
	}

}
