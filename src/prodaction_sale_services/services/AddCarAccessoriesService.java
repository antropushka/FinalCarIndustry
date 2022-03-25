package prodaction_sale_services.services;

import mainCharacteristics.Car;
import mainCharacteristics.CarsAccessories;

public class AddCarAccessoriesService implements Service<CarsAccessories> {

    @Override
    public void provideService(Car car, CarsAccessories value) {

        car.getAdditionalAccessories(value);
                System.out.println("Автобомиль имеет указанные опции");
                return;
            } else {
                car.addAdditionalAccessories();
                System.out.println("Опции, указанные в заказе, добавлены на ваш автомобиль ");
            }
        }
    }
}


