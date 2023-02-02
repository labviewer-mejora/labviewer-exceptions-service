package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.security.auth.login.LoginException;

@NoArgsConstructor
@Getter
@Setter
public class AccountExpiredException extends LoginException {

    private static final long serialVersionUID = 918729835053392521L;

    private String description = "Error la cuenta de Usuario a caducado";

    public AccountExpiredException(String message) {
        super(message);
    }
}
