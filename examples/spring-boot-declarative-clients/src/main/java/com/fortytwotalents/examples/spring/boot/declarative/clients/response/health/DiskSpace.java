package com.fortytwotalents.examples.spring.boot.declarative.clients.response.health;

record DiskSpace(
        String status,
        Details details
) {
}
