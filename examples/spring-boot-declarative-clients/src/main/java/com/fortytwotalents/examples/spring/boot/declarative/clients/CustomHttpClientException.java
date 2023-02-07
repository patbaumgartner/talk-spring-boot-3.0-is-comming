package com.fortytwotalents.examples.spring.boot.declarative.clients;

public class CustomHttpClientException extends RuntimeException{

    public CustomHttpClientException() {
        super("Calling HTTP Service via declarative HTTP client failed. No status code provide.");
    }

    public CustomHttpClientException(int statusCode) {
        super("Calling HTTP Service via declarative HTTP client failed with status code: " + statusCode);
    }

    public CustomHttpClientException(int statusCode, Throwable cause) {
        super("Calling HTTP Service via declarative HTTP client failed with status code: " + statusCode, cause);
    }
}
