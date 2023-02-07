package com.fortytwotalents.examples.spring.boot.declarative.clients;

import com.fortytwotalents.examples.spring.boot.declarative.clients.response.HealthResponse;
import com.fortytwotalents.examples.spring.boot.declarative.clients.response.InfoResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;

@Slf4j
@SpringBootApplication
public class SpringBootDeclarativeClientsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeclarativeClientsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(HttpInfoActuatorClient httpInfoActuatorClient, HttpHealthActuatorClient httpHealthActuatorClient) {
		return args -> {
			InfoResponse info = httpInfoActuatorClient.getInfo();
			log.info("Info: {}", info);

			ResponseEntity<InfoResponse> infoWithHeaders = httpInfoActuatorClient.getInfoWithHeaders();
			log.info("Info: {}", infoWithHeaders);

			HealthResponse health = httpHealthActuatorClient.getHealth();
			log.info("Health: {}", health);

			HealthResponse pingHealth = httpHealthActuatorClient.getHealth("ping");
			log.info("Ping: {}", pingHealth);
		};
	}
}
