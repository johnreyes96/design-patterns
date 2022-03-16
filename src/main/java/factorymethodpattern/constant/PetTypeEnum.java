package main.java.factorymethodpattern.constant;

public enum PetTypeEnum {

    DOG("Perro"),
    CAT("Gato");

    private final String name;

    PetTypeEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}