package com.company;

public class Terminal {
    private TerminalServer req = new TerminalServer();
    private PinValidator pin;

    public void MyCash() {
        System.out.println(req.getCash());
    }
    public void Put(double money) {
        req.put(money);
        System.out.println("your current cash is $" + req.getCash());
    }
    public void Pull(double money) {
        req.pull(money);
        System.out.println("your current cash is $" + req.getCash());
    }
}
