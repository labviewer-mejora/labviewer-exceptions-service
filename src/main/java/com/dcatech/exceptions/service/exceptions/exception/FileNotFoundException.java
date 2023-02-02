package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;

@NoArgsConstructor
@Getter
@Setter
public class FileNotFoundException extends IOException {

    private static final long serialVersionUID = 968729835053392951L;

    public static final String DESCRIPTION = "Archivo no disponible o inaccesible";

    public FileNotFoundException(String message) {
        super(message);
    }
}
