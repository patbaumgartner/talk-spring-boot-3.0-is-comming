package com.fortytwotalents.examples.spring.boot.problem.details;

import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import java.net.URI;

@ControllerAdvice(annotations = RestController.class)
public class QuestionsControllerAdvice {

    @ExceptionHandler(UnknownAnswerException.class)
    ProblemDetail handleUnknownAnswerException(UnknownAnswerException ex){
        ProblemDetail problemDetail = ProblemDetail.forStatus(HttpStatus.NOT_FOUND);
        problemDetail.setType(URI.create("https://42talents.com/problems/answers"));
        problemDetail.setTitle("Unknown Answer.");
        problemDetail.setDetail(String.format("Answer for Question '%s' not found.", ex.getQuestion()));
        return problemDetail;
    }
}
