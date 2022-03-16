package main.java.factorymethodpattern.app;

import main.java.factorymethodpattern.service.CatService;
import main.java.factorymethodpattern.service.DogService;
import main.java.factorymethodpattern.service.CreatorServiceAbstract;

import java.util.Scanner;

public class Application {

    private static CreatorServiceAbstract creatorServiceAbstract;
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        inPet();
        doService();
    }

    private static void inPet() {
        System.out.println("¿Que tipo de mascota ingresa?");
        System.out.println("Perro\nGato");
        initServiceInstance(scanner.nextLine());
    }

    private static void doService() {
        String service;
        do {
            System.out.println("\n¿Que servicio desea realizar?");
            System.out.println("Peluqueria\nCortar uñas\nFinalizar");
            service = scanner.nextLine();
            selectService(service);
        } while (!"finalizar".equalsIgnoreCase(service));
    }

    private static void initServiceInstance(String petType) {
        if ("perro".equalsIgnoreCase(petType)) {
            creatorServiceAbstract = new DogService();
        } else if ("gato".equalsIgnoreCase(petType)) {
            creatorServiceAbstract = new CatService();
        }
    }

    private static void selectService(String service) {
        if ("peluqueria".equalsIgnoreCase(service)) {
            creatorServiceAbstract.hairdresser();
        } else if ("cortar uñas".equalsIgnoreCase(service)) {
            creatorServiceAbstract.cutNails();
        }
    }
}