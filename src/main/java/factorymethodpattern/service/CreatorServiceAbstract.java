package main.java.factorymethodpattern.service;

import main.java.factorymethodpattern.pet.IService;

public abstract class CreatorServiceAbstract {

    public void hairdresser() {
        IService petType = selectPetType();
        petType.cutHair();
        petType.washHair();
        petType.dryHair();
        petType.combHair();
    }

    public void cutNails() {
        IService petType = selectPetType();
        petType.cutNails();
    }

    public abstract IService selectPetType();
}