package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ResourceAccessException extends RuntimeException {

    private static final long serialVersionUID = 932729835053392953L;

    private String description = "Error la conexión ha sido rechazada";

    public ResourceAccessException(String message) {
        super(message);
    }
}
