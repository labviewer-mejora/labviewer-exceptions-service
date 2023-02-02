package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.SQLException;

@NoArgsConstructor
@Getter
@Setter
public class SQLDataException extends SQLException {

    private static final long serialVersionUID = 933729835053392954L;

    private String description = "Error generado al realizar la consulta";

    public SQLDataException(String message) {
        super(message);
    }
}
