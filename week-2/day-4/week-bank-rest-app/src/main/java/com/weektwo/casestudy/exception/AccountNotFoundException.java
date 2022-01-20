package com.weektwo.casestudy.exception;

public class AccountNotFoundException extends  RuntimeException {

    public AccountNotFoundException(String message) {
        super(message);
    }
}
