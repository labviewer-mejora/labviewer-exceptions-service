package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class FileDataFormatException extends Exception  {
    private static final long serialVersionUID = 918529834053392221L;

    private String description = "Formato del archivo inválido";

    public FileDataFormatException(String message) {
        super(message);
    }
}
