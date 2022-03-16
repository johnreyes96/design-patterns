package main.java.factorymethodpattern.service;

import main.java.factorymethodpattern.pet.DogImpl;
import main.java.factorymethodpattern.pet.IPetType;

public class DogService extends ServiceAbstract {

    private IPetType dog;

    @Override
    public IPetType selectPetType() {
        if (dog == null) {
            dog = new DogImpl();
        }
        return dog;
    }
}