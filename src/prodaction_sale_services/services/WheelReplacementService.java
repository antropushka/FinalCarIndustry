package prodaction_sale_services.services;

import mainCharacteristics.Car;
import mainCharacteristics.WheelSizeList;

public class WheelReplacementService implements Service<WheelSizeList> {

    @Override
    public void provideService(Car car, WheelSizeList value) {
        if (car.getWheelSize().equals(value)) {
            System.out.println("Текущий размер колес соответствует размеру, указанному в заказе.");
            return;
        } else {
            car.setWheelSize(value);
            System.out.println("Колеса заменены на "  + value.name() + " размер.");
        }
    }
}
