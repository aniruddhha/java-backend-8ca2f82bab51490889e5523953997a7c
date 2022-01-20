package com.weektwo.casestudy.exception;

public class InActiveAccountException extends RuntimeException {

    public InActiveAccountException(String message) {
        super(message);
    }
}
