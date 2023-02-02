package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class NumberFormatException extends RuntimeException {

    private static final long serialVersionUID = 930729835053392951L;

    private String description = "Error el formato numérico es incorrecto ";

    public NumberFormatException(String message) {
        super(message);
    }
}
