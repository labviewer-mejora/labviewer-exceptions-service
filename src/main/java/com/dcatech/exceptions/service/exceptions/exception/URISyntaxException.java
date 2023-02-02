package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class URISyntaxException extends Exception {

    private static final long serialVersionUID = 918729835053392951L;

    private String description = "Error la dirección HTTP, no está formada correctamente";

    public URISyntaxException(String message) {
        super(message);
    }
}
