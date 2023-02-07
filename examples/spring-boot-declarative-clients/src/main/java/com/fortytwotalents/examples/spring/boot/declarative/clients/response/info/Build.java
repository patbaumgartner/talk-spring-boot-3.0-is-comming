package com.fortytwotalents.examples.spring.boot.declarative.clients.response.info;

import java.time.ZonedDateTime;

public record Build(
        ZonedDateTime time,
        String version,
        String host,
        User user,
        String artifact,
        String name,
        String group) {
}
