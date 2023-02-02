package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ArithmeticException extends RuntimeException  {

    private static final long serialVersionUID = 918729835053392952L;

    private String description = "Error realizando el cálculo del resultado :";

    public ArithmeticException(String message) {
        super(message);
    }
}
