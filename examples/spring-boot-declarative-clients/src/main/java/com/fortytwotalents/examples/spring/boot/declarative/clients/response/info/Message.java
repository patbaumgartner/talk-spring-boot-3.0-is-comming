package com.fortytwotalents.examples.spring.boot.declarative.clients.response.info;

import com.fasterxml.jackson.annotation.JsonProperty;

record Message(
        @JsonProperty("short")
        String shortMessage,
        @JsonProperty("full")
        String fullMessage) {
}
