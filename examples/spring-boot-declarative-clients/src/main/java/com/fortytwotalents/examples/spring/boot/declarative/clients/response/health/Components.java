package com.fortytwotalents.examples.spring.boot.declarative.clients.response.health;

public record Components(
        DiskSpace diskSpace, Ping ping
) {
}

