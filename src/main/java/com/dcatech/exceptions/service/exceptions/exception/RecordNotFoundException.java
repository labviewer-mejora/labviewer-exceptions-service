package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class RecordNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 931729835053392952L;

    private String description = "Consulta no Genera Resultados ";

    public RecordNotFoundException(String message) {
        super(message);
    }
}
