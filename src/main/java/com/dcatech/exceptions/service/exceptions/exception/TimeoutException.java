package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class TimeoutException  extends Exception {

    private static final long serialVersionUID = 936729835053322957L;

    private String description = "Error el tiempo de respuesta a caducado ";

    public TimeoutException(String message) {
        super(message);
    }
}
