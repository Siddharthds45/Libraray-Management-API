package com.siddharth.springboot.exception;

public class BookException extends RuntimeException{

    public BookException(String name){
        super(name);
    }
}
