package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class NullPointerException extends RuntimeException {

    private static final long serialVersionUID = 920729835053392954L;

    private String description = "La consulta de datos realizada no retorna registros";

    public NullPointerException(String message) {
        super(message);
    }
}
