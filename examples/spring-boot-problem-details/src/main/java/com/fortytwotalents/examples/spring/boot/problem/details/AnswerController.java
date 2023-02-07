package com.fortytwotalents.examples.spring.boot.problem.details;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/answers")
public class AnswerController {

    @GetMapping("/{question}")
    public Answer answer(@PathVariable String question){
        throw new UnknownAnswerException(question);
    }
}
