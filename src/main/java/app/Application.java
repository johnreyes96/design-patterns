package main.java.app;

import main.java.service.DogService;
import main.java.service.ServiceAbstract;

public class Application {

    private static ServiceAbstract serviceAbstract;

    public static void main(String[] args) {
        inPet();
        doService();
    }

    private static void inPet() {
        if ("dog".equalsIgnoreCase("dog")) {
            serviceAbstract = new DogService();
        }
    }

    private static void doService() {
        if ("hairdresser".equalsIgnoreCase("hairdresser")) {
            serviceAbstract.hairdresser();
        }
    }
}