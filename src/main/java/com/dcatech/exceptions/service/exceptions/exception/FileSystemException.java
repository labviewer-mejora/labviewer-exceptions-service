package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.IOException;

@NoArgsConstructor
@Getter
@Setter
public class FileSystemException extends IOException {

    private static final long serialVersionUID = 927729835053392951L;

    private String description = "Error generado al procesar el archivo";

    public FileSystemException(String message) {
        super(message);
    }
}
