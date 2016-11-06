package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Terminal t = new Terminal();
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(true) {
            System.out.println("enter PIN: ");
            int MyPIN;
            try {
                MyPIN = sc.nextInt();
                if (MyPIN < 1000 || MyPIN > 9999)
                    throw new WrongPinException();
                else if (MyPIN == 1111)
                    break;
                if (i == 2) {
                    long start, finish;
                    int time = 5000; // time to sleep
                    start = System.currentTimeMillis();
                    if (sc.next() != null) {
                        finish = System.currentTimeMillis();
                        throw new AccountIsLockedException((time - finish + start) / 1000);
                    }
                    Thread.sleep(time);
                }
                i++;
                System.out.println(i);
            } catch (WrongPinException e) {
                System.out.println("ololo" + e);
            } catch (AccountIsLockedException e) {}
        }
        System.out.println("1 - my cash, 2 - put money, 3 - pull money");
        switch (sc.nextInt()) {
            case 1:
                t.MyCash();
                break;
            case 2:
                System.out.println("enter number: ");
                t.Put(sc.nextDouble());
                break;
            case 3:
                System.out.println("enter number: ");
                t.Pull(sc.nextDouble());
                break;
        }
    }
}
