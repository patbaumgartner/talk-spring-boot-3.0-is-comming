package com.fortytwotalents.examples.spring.boot.declarative.clients.response.info;

import com.fasterxml.jackson.annotation.JsonProperty;

record Id(
        @JsonProperty("describe-short")
        String describeShort,
        String abbrev,
        String full,
        String describe
) {
}

