package main.java.service;

import main.java.pet.IPetType;

public abstract class ServiceAbstract {

    public void hairdresser() {
        IPetType petType = selectPet();
        petType.cutHair();
        petType.washHair();
        petType.dryHair();
        petType.combHair();
    }

    public void cutNails() {
        IPetType petType = selectPet();
        petType.cutNails();
    }

    public abstract IPetType selectPet();
}