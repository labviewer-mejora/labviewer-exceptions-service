package com.dcatech.exceptions.service.exceptions.exception;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class JasperReportException extends RuntimeException {

    private static final long serialVersionUID = 933729835053392954L;

    private String description = "Error generando el reporte Jasper";

    public JasperReportException(String message) {
        super(message);
    }


}
