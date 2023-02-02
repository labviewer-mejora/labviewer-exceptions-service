package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ClassNotFoundException extends Exception  {
    private static final long serialVersionUID = 918729835053392221L;

    private String description = "La clase de referencia no se encuentra en el classpath ";

    public ClassNotFoundException(String message) {
        super(message);
    }
}
