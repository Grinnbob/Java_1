package com.company;

public class AccountIsLockedException extends Exception {
    public AccountIsLockedException(long time) {
        throw new IllegalArgumentException("Account is locked still " + time + " sec ");
    }
}
