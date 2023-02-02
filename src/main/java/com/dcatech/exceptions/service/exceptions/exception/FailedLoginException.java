package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.security.auth.login.LoginException;

@NoArgsConstructor
@Getter
@Setter
public class FailedLoginException extends LoginException {
    private static final long serialVersionUID = 938529835053392221L;

    private String description = "Error Usuario o Contraseña incorrecto";

    public FailedLoginException(String message) {
        super(message);
    }
}
