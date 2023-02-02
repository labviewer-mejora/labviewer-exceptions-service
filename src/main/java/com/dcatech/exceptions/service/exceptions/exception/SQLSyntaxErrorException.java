package com.dcatech.exceptions.service.exceptions.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.SQLException;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SQLSyntaxErrorException extends SQLException {

    private static final long serialVersionUID = 934729835053392955L;

    private String DESCRIPTION = "Error de sintaxis en la consulta de datos";
    private int CODE = 400;
    private String message;

    public SQLSyntaxErrorException(String message) {
        this.message = message;
    }
}
