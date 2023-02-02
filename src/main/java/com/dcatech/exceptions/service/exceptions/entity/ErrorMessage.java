package com.dcatech.exceptions.service.exceptions.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage implements Serializable {

    private static final long serialVersionUID = -6410021740550428676L;
    private String request;
    private String method;
    private int status;
    private String error;
    private String message;

}
