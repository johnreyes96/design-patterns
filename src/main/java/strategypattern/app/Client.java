package main.java.strategypattern.app;

import main.java.strategypattern.strategy.BancolombiaPaymentImpl;

public class Client {

    public static void main(String[] args) {
        Pse pse = new Pse();
        pse.setBankPayment(new BancolombiaPaymentImpl());
        pse.pay(25000d);
    }
}
