package com.fortytwotalents.examples.spring.boot.declarative.clients.response.info;

public record Java(
        String version,
        Vendor vendor,
        Runtime runtime,
        Jvm jvm) {
}
