package main.java.factorymethodpattern.service;

import main.java.factorymethodpattern.pet.IService;

public abstract class CreatorServiceAbstract {

    public void hairdresser() {
        IService petType = createService();
        petType.cutHair();
        petType.washHair();
        petType.dryHair();
        petType.combHair();
    }

    public void cutNails() {
        IService petType = createService();
        petType.cutNails();
    }

    public abstract IService createService();
}