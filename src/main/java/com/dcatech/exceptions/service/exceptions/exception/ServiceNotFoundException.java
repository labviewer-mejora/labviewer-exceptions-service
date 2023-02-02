package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.management.OperationsException;

@NoArgsConstructor
@Getter
@Setter
public class ServiceNotFoundException extends OperationsException {

    private static final long serialVersionUID = 932729835053392953L;

    private String description = "Error el servicio no es compatible con la solicitud realizada ";

    public ServiceNotFoundException(String message) {
        super(message);
    }
}
