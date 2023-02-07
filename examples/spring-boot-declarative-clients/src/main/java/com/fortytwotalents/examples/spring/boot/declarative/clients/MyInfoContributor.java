package com.fortytwotalents.examples.spring.boot.declarative.clients;

import java.util.HashMap;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class MyInfoContributor implements InfoContributor {

    @Override
    public void contribute(Info.Builder builder) {
        HashMap<String, String> map = new HashMap<>();
        map.put("question", "The answer to life the universe and everything ...");
        map.put("answer", "42");

        builder.withDetail("questions", map);
    }

}

