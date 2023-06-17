package com.exafinalpro.progfinal.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class Notfoundexception extends RuntimeException {
    public Notfoundexception() {
    }

    public Notfoundexception(String message) {
        super(message);
    }

    public Notfoundexception(String message, Throwable cause) {
        super(message, cause);
    }

    public Notfoundexception(Throwable cause) {
        super(cause);
    }

    public Notfoundexception(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
