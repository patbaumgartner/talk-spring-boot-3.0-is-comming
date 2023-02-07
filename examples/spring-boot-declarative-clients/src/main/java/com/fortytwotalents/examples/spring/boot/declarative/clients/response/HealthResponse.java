package com.fortytwotalents.examples.spring.boot.declarative.clients.response;

import com.fortytwotalents.examples.spring.boot.declarative.clients.response.health.Components;
import lombok.Data;

@Data
public class HealthResponse {

    private String status;
    private Components components;

}
