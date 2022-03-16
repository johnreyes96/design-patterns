package main.java.factorymethodpattern.service;

public interface ICreatorServiceAbstractFactory {

    CreatorServiceAbstract getInstanceServiceAbstract(String service);
}