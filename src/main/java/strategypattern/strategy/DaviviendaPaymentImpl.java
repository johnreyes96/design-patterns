package main.java.strategypattern.strategy;

public class DaviviendaPaymentImpl implements IBankPayment {

    @Override
    public void pay(Double value) {
        System.out.printf("Pagando $%s desde Davivienda", value);
    }
}
