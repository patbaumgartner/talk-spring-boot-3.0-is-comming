package com.fortytwotalents.examples.spring.boot.declarative.clients.response.info;

public record Git(
        Local local,
        Commit commit,
        String branch,
        Build build,
        String tags,
        Total total,
        Closest closest,
        Remote remote,
        String dirty) {
}
