package com.amogoscode.demoAgain.Exception;

import com.sun.org.apache.xpath.internal.objects.XObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.ZoneId;
import java.time.ZonedDateTime;

@ControllerAdvice
public class APIExceptionHandler {

    @ExceptionHandler(value= {APIRequestException.class})
    public ResponseEntity<Object> handleAPIRequestException (APIRequestException e){
        //Create a Payload
        HttpStatus badRequest = HttpStatus.BAD_REQUEST;
        APIException apiException = new APIException(
                e.getMessage(),
                badRequest,
                e,
                ZonedDateTime.now(ZoneId.of("Z"))
        );
        //Return the response entity
        return new ResponseEntity<>(apiException, badRequest);

    }
}
