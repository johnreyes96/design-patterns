package main.java.pet;

public class CatImpl implements IPetType {

    @Override
    public void cutHair() {
        System.out.println("Cortando el cabello con máquina");
    }

    @Override
    public void washHair() {
        System.out.println("Lavando el cabello con agua caliente");
    }

    @Override
    public void dryHair() {
        System.out.println("Secando el cabello con secadora");
    }

    @Override
    public void combHair() {
        System.out.println("Peinando el cabello con peinilla");
    }

    @Override
    public void cutNails() {
        System.out.println("Cortando uñas");
    }
}