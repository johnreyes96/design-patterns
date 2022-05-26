package main.java.strategypattern.strategy;

public class BancolombiaPaymentImpl implements IBankPayment {

    @Override
    public void pay(Double value) {
        System.out.printf("Pagando $%s desde Bancolombia", value);
    }
}
