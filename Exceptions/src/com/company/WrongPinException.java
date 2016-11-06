package com.company;

public class WrongPinException extends Exception {
    public WrongPinException(){
        throw new IllegalArgumentException("not valid PIN");
    }
}
