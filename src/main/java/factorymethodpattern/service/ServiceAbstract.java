package main.java.factorymethodpattern.service;

import main.java.factorymethodpattern.pet.IPetType;

public abstract class ServiceAbstract {

    public void hairdresser() {
        IPetType petType = selectPetType();
        petType.cutHair();
        petType.washHair();
        petType.dryHair();
        petType.combHair();
    }

    public void cutNails() {
        IPetType petType = selectPetType();
        petType.cutNails();
    }

    public abstract IPetType selectPetType();
}