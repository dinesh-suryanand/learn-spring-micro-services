package com.dinesh.hotel.hotel.microservice.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String s){
        super(s);
    }

    public ResourceNotFoundException(){
        super("ResourceNotFound");
    }
}
