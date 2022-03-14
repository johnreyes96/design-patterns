package main.java.app;

import main.java.service.DogService;
import main.java.service.ServiceAbstract;

import java.util.Scanner;

public class Application {

    private static ServiceAbstract serviceAbstract;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inPet();
        doService();
    }

    private static void inPet() {
        System.out.println("¿Que tipo de mascota ingresa?");
        System.out.println("Perro");
        initServiceInstance(scanner.nextLine());
    }

    private static void doService() {
        System.out.println("¿Que servicio desea realizar?");
        System.out.println("Peluqueria\nCortar uñas");
        selectService(scanner.nextLine());
    }

    private static void initServiceInstance(String petType) {
        if ("perro".equalsIgnoreCase(petType)) {
            serviceAbstract = new DogService();
        }
    }

    private static void selectService(String service) {
        if ("peluqueria".equalsIgnoreCase(service)) {
            serviceAbstract.hairdresser();
        } else if ("cortar uñas".equalsIgnoreCase(service)) {
            serviceAbstract.cutNails();
        }
    }
}