package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class EnumConstantNotPresentException extends RuntimeException  {
    private static final long serialVersionUID = 928529835053392221L;

    private String description = "Error la clase no contiene objetos enum de ese tipo";

    public EnumConstantNotPresentException(String message) {
        super(message);
    }
}
