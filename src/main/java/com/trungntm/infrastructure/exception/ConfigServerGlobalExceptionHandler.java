package com.trungntm.infrastructure.exception;

import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@Primary
public class ConfigServerGlobalExceptionHandler extends GlobalExceptionHandler {

    @ExceptionHandler({DuplicateRecordException.class})
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<ErrorDTO> handleDuplicateRecordException(DuplicateRecordException ex) {
        return this.processRuntimeException(ex);
    }
}
