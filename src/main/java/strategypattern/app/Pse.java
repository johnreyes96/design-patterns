package main.java.strategypattern.app;

import main.java.strategypattern.strategy.IBankPayment;

public class Pse {

    private IBankPayment bankPayment;

    public void pay(Double value) {
        bankPayment.pay(value);
    }

    public void setBankPayment(IBankPayment bankPayment) {
        this.bankPayment = bankPayment;
    }
}
