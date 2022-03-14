package main.java.service;

import main.java.pet.DogImpl;
import main.java.pet.IPetType;

public class DogService extends ServiceAbstract {

    private IPetType dog;

    @Override
    public IPetType selectPet() {
        if (dog == null) {
            dog = new DogImpl();
        }
        return dog;
    }
}