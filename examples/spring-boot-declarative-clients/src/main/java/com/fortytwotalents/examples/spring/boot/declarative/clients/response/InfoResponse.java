package com.fortytwotalents.examples.spring.boot.declarative.clients.response;

import com.fortytwotalents.examples.spring.boot.declarative.clients.response.info.App;
import com.fortytwotalents.examples.spring.boot.declarative.clients.response.info.Build;
import com.fortytwotalents.examples.spring.boot.declarative.clients.response.info.Git;
import com.fortytwotalents.examples.spring.boot.declarative.clients.response.info.Java;
import lombok.Data;

@Data
public class InfoResponse {
    private App app;
    private Git git;
    private Build build;
    private Java java;
}