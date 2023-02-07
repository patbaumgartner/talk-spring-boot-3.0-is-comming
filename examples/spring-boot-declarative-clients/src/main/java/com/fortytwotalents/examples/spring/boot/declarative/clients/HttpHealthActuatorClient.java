package com.fortytwotalents.examples.spring.boot.declarative.clients;

import com.fortytwotalents.examples.spring.boot.declarative.clients.response.HealthResponse;
import com.fortytwotalents.examples.spring.boot.declarative.clients.response.InfoResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "/health", accept = MediaType.APPLICATION_JSON_VALUE)
public interface HttpHealthActuatorClient {

        @GetExchange
        HealthResponse getHealth();

        @GetExchange("/{component}")
        HealthResponse getHealth(@PathVariable String component);
}
