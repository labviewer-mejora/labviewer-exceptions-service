package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ArrayStoreException extends RuntimeException  {
    private static final long serialVersionUID = 918729835053392521L;

    private String description = "Error los objetos de la matriz no son los correctos";

    public ArrayStoreException(String message) {
        super(message);
    }
}
