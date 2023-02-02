package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ClassCastException extends RuntimeException  {
    private static final long serialVersionUID = 918719835053392521L;

    private String description = "Error la conversión de la clase no es correcta ";

    public ClassCastException(String message) {
        super(message);
    }
}
