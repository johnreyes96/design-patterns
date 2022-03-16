package main.java.factorymethodpattern.service;

import main.java.constant.PetTypeEnum;

import java.util.HashMap;
import java.util.Map;

public class ServiceAbstractFactoryImpl implements IServiceAbstractFactory {

    private final Map<String, ServiceAbstract> mapService = new HashMap<>();

    public ServiceAbstractFactoryImpl() {
        mapService.put(PetTypeEnum.DOG.getName().toLowerCase(), new DogService());
        mapService.put(PetTypeEnum.CAT.getName().toLowerCase(), new CatService());
    }

    @Override
    public ServiceAbstract getInstanceServiceAbstract(String service) {
        return mapService.get(service.toLowerCase());
    }
}