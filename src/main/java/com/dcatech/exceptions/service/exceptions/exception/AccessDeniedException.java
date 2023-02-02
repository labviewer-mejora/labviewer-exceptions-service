package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AccessDeniedException extends FileSystemException  {

    private static final long serialVersionUID = 918729835053392921L;

    private String description = "Error el acceso a los archivos del directorio es inválido";

    public AccessDeniedException(String message) {
        super(message);
    }
}
