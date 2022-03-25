package prodaction_sale_services;

import bmw.BMWCarFactory;
import mainCharacteristics.Car;
import prodaction_sale_services.dealership.DealershipOrder;
import volkswagenGroup.VolkswagenGroupFactory;
import volvo.VolvoCarFactory;

import java.util.ArrayList;
import java.util.List;

public class Factories {

    private static List<CarFactory> factories;

    static {
        factories = new ArrayList<>();
        factories.add(new BMWCarFactory());
        factories.add(new VolvoCarFactory());
        factories.add(new VolvoCarFactory());
    }

    public Car clientOrderFullfillment (DealershipOrder dealershipOrder) {
        switch (dealershipOrder.getMAKE()) {
            case BMW -> {
                return  BMWCarFactory.
            }
            case VOLVO -> {
                return VolvoCarFactory.
            }
            case VOLKSWAGEN_GROUP -> {
                return VolkswagenGroupFactory.
            }
            default -> {
                return null;
            }
        }
    }
}

