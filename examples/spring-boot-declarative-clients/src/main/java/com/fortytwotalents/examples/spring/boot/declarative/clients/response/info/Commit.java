package com.fortytwotalents.examples.spring.boot.declarative.clients.response.info;

import java.time.ZonedDateTime;

record Commit(
        Id id,
        Message message,
        User user,
        Author author,
        Committer committer,
        ZonedDateTime time,
        String count) {
}
