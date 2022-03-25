package prodaction_sale_services.services;

import mainCharacteristics.Car;
import mainCharacteristics.CarsAccessories;

import java.util.HashSet;

public class RemoveCarAccessoriesService implements Service<CarsAccessories>{

    @Override
    public void provideService(Car car, CarsAccessories value) {

    }

    public void removeAccessories(Car car, HashSet<CarsAccessories> additionalAccessories) {
        for (CarsAccessories present : car.getAdditionalAccessories()) {
            if (present.equals(additionalAccessories)) {
                System.out.println("Автобомиль имеет указанные опции");
                return;
            } else {
                car.setAdditionalAccessories(additionalAccessories);
                System.out.println("Опции, указанные в заказе, добавлены на ваш автомобиль ");
            }
        }
    }
}
