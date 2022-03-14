package main.java.service;

import main.java.pet.DogImpl;
import main.java.pet.IPetType;

public class DogService extends ServiceAbstract {

    @Override
    public IPetType selectPet() {
        return new DogImpl();
    }
}