package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ConnectException extends Exception  {
    private static final long serialVersionUID = 918724835053392221L;

    private String description = "Error realizando la conexión al servidor ";

    public ConnectException(String message) {
        super(message);
    }
}
