package main.java.factorymethodpattern.service;

import main.java.factorymethodpattern.pet.DogImpl;
import main.java.factorymethodpattern.pet.IService;

public class DogService extends CreatorServiceAbstract {

    private IService dog;

    @Override
    public IService createService() {
        if (dog == null) {
            dog = new DogImpl();
        }
        return dog;
    }
}