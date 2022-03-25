package prodaction_sale_services.services;

import mainCharacteristics.Car;

public interface Service<T> {

    void provideService(Car car, T value);
}
