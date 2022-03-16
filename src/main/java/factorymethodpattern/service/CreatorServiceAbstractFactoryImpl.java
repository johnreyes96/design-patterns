package main.java.factorymethodpattern.service;

import main.java.factorymethodpattern.constant.PetTypeEnum;

import java.util.HashMap;
import java.util.Map;

public class CreatorServiceAbstractFactoryImpl implements ICreatorServiceAbstractFactory {

    private final Map<String, CreatorServiceAbstract> mapService = new HashMap<>();

    public CreatorServiceAbstractFactoryImpl() {
        mapService.put(PetTypeEnum.DOG.getName().toLowerCase(), new DogService());
        mapService.put(PetTypeEnum.CAT.getName().toLowerCase(), new CatService());
    }

    @Override
    public CreatorServiceAbstract getInstanceServiceAbstract(String service) {
        return mapService.get(service.toLowerCase());
    }
}