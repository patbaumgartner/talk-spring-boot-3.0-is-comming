package com.fortytwotalents.examples.spring.boot.declarative.clients;

import com.fortytwotalents.examples.spring.boot.declarative.clients.response.InfoResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange(url = "/info", accept = MediaType.APPLICATION_JSON_VALUE)
public interface HttpInfoActuatorClient {

        @GetExchange
        InfoResponse getInfo();

        @GetExchange
        ResponseEntity<InfoResponse> getInfoWithHeaders();
}
