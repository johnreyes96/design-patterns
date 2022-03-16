package main.java.factorymethodpattern.service;

import main.java.factorymethodpattern.pet.CatImpl;
import main.java.factorymethodpattern.pet.IService;

public class CatService extends CreatorServiceAbstract {

    private IService cat;

    @Override
    public IService createService() {
        if (cat == null) {
            cat = new CatImpl();
        }
        return cat;
    }
}