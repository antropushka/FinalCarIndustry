package musor.actionsWithCar;

import bmw.CarsModels;
import bmw.CountryOfProduction;
import mainCharacteristics.*;
import volkswagenGroup.CarBodyType;
import volkswagenGroup.CarsMarksList;
import volvo.HorsePower;
import volvo.PassengerCarsModels;

public interface Creatable {
    Car createBMWCar(CarsMake MAKE,
                     Integer MANUFACTURE_YEAR,
                     EngineCapacityList ENGINE_CAPACITY,
                     CarsColor color,
                     WheelSizeList wheelSize,
                     CarsModels carsModels,
                     CountryOfProduction countryOfProduction);

    Car createVolvoCar (CarsMake make,
                        Integer manufactureYear,
                        EngineCapacityList engineCapacity,
                        CarsColor color,
                        WheelSizeList wheelSize,
                        PassengerCarsModels passengerCarsModels,
                        HorsePower horsePower);

    Car createVolkswagenGroupCar (CarsMake MAKE,
                                  Integer MANUFACTURE_YEAR,
                                  EngineCapacityList ENGINE_CAPACITY,
                                  CarsColor color,
                                  WheelSizeList wheelSize,
                                  CarsMarksList carsMark,
                                  CarBodyType carsBodyType);

}
