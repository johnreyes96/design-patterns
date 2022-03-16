package main.java.factorymethodpattern.app;

import main.java.factorymethodpattern.constant.ServiceEnum;
import main.java.factorymethodpattern.service.CreatorServiceAbstract;
import main.java.factorymethodpattern.service.CreatorServiceAbstractFactoryImpl;

import java.util.Scanner;

public class Application {

    private static final CreatorServiceAbstractFactoryImpl serviceAbstractFactory = new CreatorServiceAbstractFactoryImpl();
    private static final Scanner scanner = new Scanner(System.in);
    private static CreatorServiceAbstract creatorServiceAbstract;

    public static void main(String[] args) {
        inPet();
        doService();
    }

    private static void inPet() {
        System.out.println("¿Que tipo de mascota ingresa?");
        System.out.println("Perro\nGato");
        creatorServiceAbstract = serviceAbstractFactory.getInstanceServiceAbstract(scanner.nextLine());
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

    private static void selectService(String service) {
        if (ServiceEnum.HAIRDRESSER.getName().equalsIgnoreCase(service)) {
            creatorServiceAbstract.hairdresser();
        } else if (ServiceEnum.CUTNAILS.getName().equalsIgnoreCase(service)) {
            creatorServiceAbstract.cutNails();
        }
    }
}