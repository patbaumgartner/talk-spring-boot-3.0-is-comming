package com.fortytwotalents.examples.spring.boot.declarative.clients.response.health;

record Details(
        long total,
        long free,
        int threshold,
        String path,
        boolean exists
) {
}
