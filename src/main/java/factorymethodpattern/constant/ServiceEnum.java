package main.java.factorymethodpattern.constant;

public enum ServiceEnum {

    HAIRDRESSER("Peluqueria"),
    CUTNAILS("Cortar uñas");

    private final String name;

    ServiceEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}