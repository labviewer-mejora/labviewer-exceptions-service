package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class NotFoundUserIdException extends RuntimeException {

    private static final long serialVersionUID = 921729835053392953L;

    private String description = "No se encuentra el registro consultado";

    public NotFoundUserIdException(String message) {
        super(message);
    }
}
