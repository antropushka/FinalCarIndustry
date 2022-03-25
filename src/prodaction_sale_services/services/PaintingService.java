package prodaction_sale_services.services;

import mainCharacteristics.Car;
import mainCharacteristics.CarsColor;

public class PaintingService implements Service<CarsColor> {

    @Override
    public void provideService(Car car, CarsColor value) {
        if(car.getColor().equals(value)) {
            System.out.println("Цвет автомобиля соответствует цвету, указанному в заказе.");
            return;
        } else {
            car.setColor(value);
            System.out.println("Цвет автомобиля изменен в соответствии с заказом. Текущий цвет " + value.name());
        }
    }
}

