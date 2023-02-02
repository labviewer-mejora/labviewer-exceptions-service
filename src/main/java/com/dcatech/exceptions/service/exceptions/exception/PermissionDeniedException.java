package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PermissionDeniedException extends RuntimeException {

    private static final long serialVersionUID = 936729835053392957L;

    private String description = "Nombre de usuario o contraseña no válidos especificados";

    public PermissionDeniedException(String message) {
        super(message);
    }
}
