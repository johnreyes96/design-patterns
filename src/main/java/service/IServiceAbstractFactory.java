package main.java.service;

public interface IServiceAbstractFactory {

    ServiceAbstract getInstanceServiceAbstract(String service);
}