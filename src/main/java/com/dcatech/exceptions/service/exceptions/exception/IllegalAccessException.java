package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class IllegalAccessException extends ReflectiveOperationException {

    private static final long serialVersionUID = 925729835053392951L;

    private String description = "Error a la clase, es posible que no tenga acceso a la definición de la misma";

    public IllegalAccessException(String message) {
        super(message);
    }
}
