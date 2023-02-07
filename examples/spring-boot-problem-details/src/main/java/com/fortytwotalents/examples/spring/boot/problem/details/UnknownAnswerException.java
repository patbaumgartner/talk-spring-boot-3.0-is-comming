package com.fortytwotalents.examples.spring.boot.problem.details;

import lombok.Data;

@Data
public class UnknownAnswerException extends RuntimeException {

    private String question;

    public UnknownAnswerException(String question) {
        this.question = question;
    }

    public UnknownAnswerException(String question, Throwable cause) {
        super(cause);
        this.question = question;
    }

}
