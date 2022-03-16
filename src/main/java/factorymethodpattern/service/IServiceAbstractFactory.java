package main.java.factorymethodpattern.service;

public interface IServiceAbstractFactory {

    ServiceAbstract getInstanceServiceAbstract(String service);
}