package main.java.factorymethodpattern.app;

import main.java.constant.ServiceEnum;
import main.java.factorymethodpattern.service.ServiceAbstract;
import main.java.factorymethodpattern.service.ServiceAbstractFactoryImpl;

import java.util.Scanner;

public class Application {

    private static final ServiceAbstractFactoryImpl serviceAbstractFactory = new ServiceAbstractFactoryImpl();
    private static final Scanner scanner = new Scanner(System.in);
    private static ServiceAbstract serviceAbstract;

    public static void main(String[] args) {
        inPet();
        doService();
    }

    private static void inPet() {
        System.out.println("¿Que tipo de mascota ingresa?");
        System.out.println("Perro\nGato");
        serviceAbstract = serviceAbstractFactory.getInstanceServiceAbstract(scanner.nextLine());
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
            serviceAbstract.hairdresser();
        } else if (ServiceEnum.CUTNAILS.getName().equalsIgnoreCase(service)) {
            serviceAbstract.cutNails();
        }
    }
}