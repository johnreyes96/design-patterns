package main.java.factorymethodpattern.service;

import main.java.factorymethodpattern.pet.CatImpl;
import main.java.factorymethodpattern.pet.IPetType;

public class CatService extends ServiceAbstract {

    private IPetType cat;

    @Override
    public IPetType selectPetType() {
        if (cat == null) {
            cat = new CatImpl();
        }
        return cat;
    }
}