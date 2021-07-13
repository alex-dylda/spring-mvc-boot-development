package com.acme.dbo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "test reason")
public class ClientNotFoundException extends Exception {
    public ClientNotFoundException(final String message) {
        super(message);
    }
}
