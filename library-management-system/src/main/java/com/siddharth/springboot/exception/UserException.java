package com.siddharth.springboot.exception;

public class UserException extends RuntimeException{

    public UserException(String name){
        super(name);
    }
}
