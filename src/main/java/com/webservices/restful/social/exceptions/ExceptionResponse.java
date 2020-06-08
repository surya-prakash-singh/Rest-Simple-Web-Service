package com.webservices.restful.social.exceptions;

import java.util.Date;

public class ExceptionResponse {
    private Date timestamp;
    private String name;
    private String details;

    public ExceptionResponse(Date timestamp, String message, String details) {
        super();
        this.timestamp = timestamp;
        this.name = message;
        this.details = details;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMessage() {
        return name;
    }

    public String getDetails() {
        return details;
    }

}