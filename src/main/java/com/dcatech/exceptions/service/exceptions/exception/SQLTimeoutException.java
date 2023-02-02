package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.SQLException;

@NoArgsConstructor
@Getter
@Setter
public class SQLTimeoutException extends SQLException {

    private static final long serialVersionUID = 935729835053392956L;

    private String description = "Error el tiempo de espera en la consulta a expirado";

    public SQLTimeoutException(String message) {
        super(message);
    }
}
