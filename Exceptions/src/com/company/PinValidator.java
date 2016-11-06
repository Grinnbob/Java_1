package com.company;

public class PinValidator {
    private int UserPIN = 1111;
    public PinValidator(int PIN) throws WrongPinException {
        if(PIN != UserPIN)
            throw new WrongPinException();
    }
}
