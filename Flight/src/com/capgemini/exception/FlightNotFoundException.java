package com.capgemini.exception;

public class FlightNotFoundException extends RuntimeException {
    public FlightNotFoundException(String msg)
    {
        super(msg);
    }
}
