package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;

@NoArgsConstructor
@Getter
@Setter
public class HttpRetryException extends IOException {

    private static final long serialVersionUID = 926729835053392951L;

    private String description = "Error no es posible actualizar la página";

    public HttpRetryException(String message) {
        super(message);
    }
}
