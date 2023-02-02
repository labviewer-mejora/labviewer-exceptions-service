package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class DateTimeException extends RuntimeException  {
    private static final long serialVersionUID = 918529835053392221L;

    private String description = "Error al realizar el cálculo de las fechas";

    public DateTimeException(String message) {
        super(message);
    }
}
