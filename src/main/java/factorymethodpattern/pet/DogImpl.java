package main.java.factorymethodpattern.pet;

public class DogImpl implements IService {

    @Override
    public void cutHair() {
        System.out.println("Cortando el cabello con tijeras");
    }

    @Override
    public void washHair() {
        System.out.println("Lavando el cabello con agua fría y shampoo de perro");
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