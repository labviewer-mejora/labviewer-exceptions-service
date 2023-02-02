package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EventException extends RuntimeException  {
    private static final long serialVersionUID = 918521835053392221L;

    private String description = "El evento ejecutado a generado un error ";

    public EventException(String message) {
        super(message);
    }
}
