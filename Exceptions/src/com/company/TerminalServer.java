package com.company;

public class TerminalServer {
    private double Cash = 1000;
    public double getCash() {
        return Cash;
    }
    public void put(double money) {
        if(money % 100 != 0)
            throw new IllegalArgumentException("Not valid value");
        Cash += money;
    }
    public void pull(double money) {
        if(money % 100 != 0)
            throw new IllegalArgumentException("Not valid value");
        Cash -= money;
        if(Cash < 0 ) {
            Cash += money;
            throw new IllegalArgumentException("Not enough money");
        }
    }
}
