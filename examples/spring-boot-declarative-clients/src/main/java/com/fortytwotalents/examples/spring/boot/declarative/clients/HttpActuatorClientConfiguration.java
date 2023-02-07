package com.fortytwotalents.examples.spring.boot.declarative.clients;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.support.WebClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;
import reactor.core.publisher.Mono;

@Configuration
public class HttpActuatorClientConfiguration {

    @Bean
    public WebClient webClient(){
        return WebClient.builder()
                .baseUrl("http://localhost:8080/actuator")
                .defaultStatusHandler(
                        httpStatusCode -> HttpStatus.NOT_FOUND == httpStatusCode,
                        response -> Mono.empty())
                .defaultStatusHandler(
                        HttpStatusCode::is5xxServerError,
                        response -> Mono.error(new CustomHttpClientException(response.statusCode().value())))
                .build();
    }

    @Bean
    public HttpInfoActuatorClient httpInfoActuatorClient(WebClient webClient) {
        return HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build()
                .createClient(HttpInfoActuatorClient.class);
    }

    @Bean
    public HttpHealthActuatorClient httpHealthActuatorClient(WebClient webClient) {
        return HttpServiceProxyFactory
                .builder(WebClientAdapter.forClient(webClient))
                .build()
                .createClient(HttpHealthActuatorClient.class);
    }
}
