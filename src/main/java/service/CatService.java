package main.java.service;

import main.java.pet.CatImpl;
import main.java.pet.IPetType;

public class CatService extends ServiceAbstract {

    private IPetType cat;

    @Override
    public IPetType selectPet() {
        if (cat == null) {
            cat = new CatImpl();
        }
        return cat;
    }
}