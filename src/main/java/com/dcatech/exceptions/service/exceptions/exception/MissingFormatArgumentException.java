package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class MissingFormatArgumentException extends IllegalArgumentException {

    private static final long serialVersionUID = 923729835053392951L;

    private String description = "Error No se han enviado todos los parámetros requeridos";

    public MissingFormatArgumentException(String message) {
        super(message);
    }
}
