package com.amogoscode.demoAgain.Exception;

import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;

public class APIException {

    private final String message;
    private final HttpStatus httpsStatusCode;
    private final ZonedDateTime timeStamp;

    public APIException(String message, HttpStatus httpsStatusCode, Throwable throwable, ZonedDateTime timeStamp) {
        this.message = message;
        this.httpsStatusCode = httpsStatusCode;
        this.timeStamp = timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public HttpStatus getHttpsStatusCode() {
        return httpsStatusCode;
    }

       public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }
}
