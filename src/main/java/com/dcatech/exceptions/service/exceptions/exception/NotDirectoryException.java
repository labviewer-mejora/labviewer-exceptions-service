package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;

@NoArgsConstructor
@Getter
@Setter
public class NotDirectoryException extends IOException {

    private static final long serialVersionUID = 922729835053392952L;

    private String description = "Error no se puede crear o validar el directorio actual";

    public NotDirectoryException(String message) {
        super(message);
    }
}
