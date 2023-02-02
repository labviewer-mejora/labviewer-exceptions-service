package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

@Setter
@Getter
public class DataAccessException extends Exception implements Serializable {

    private static final long serialVersionUID = -3939958675230214069L;
    private String description = "Error conectando con la base de datos";

    public DataAccessException(String message) {
        super(message);
    }
}
