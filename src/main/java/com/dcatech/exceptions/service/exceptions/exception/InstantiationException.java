package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class InstantiationException extends ReflectiveOperationException {

    private static final long serialVersionUID = 924729835053392951L;

    private String description = "Error creando la instancia de la clase, asegure que le definición sea correcta.";

    public InstantiationException(String message) {
        super(message);
    }
}
