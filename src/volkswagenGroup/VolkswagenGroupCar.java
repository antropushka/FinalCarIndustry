package volkswagenGroup;
import mainCharacteristics.*;

import java.util.Set;

public class VolkswagenGroupCar extends Car  {

    private final CarsMarksList carsMark;
    private final CarBodyType carsBodyType;

    public VolkswagenGroupCar(CarsMake MAKE,
                              Integer MANUFACTURE_YEAR,
                              EngineCapacityList ENGINE_CAPACITY,
                              CarsColor color,
                              WheelSizeList wheelSize,
                              CarsMarksList carsMark,
                              CarBodyType carsBodyType) {
        super(CarsMake.VOLKSWAGEN_GROUP, MANUFACTURE_YEAR, ENGINE_CAPACITY, color, wheelSize);
        this.carsMark = carsMark;
        this.carsBodyType = carsBodyType;
    }

    public VolkswagenGroupCar(CarsMake MAKE,
                              Integer MANUFACTURE_YEAR,
                              EngineCapacityList ENGINE_CAPACITY,
                              CarsColor color,
                              WheelSizeList wheelSize,
                              CarsMarksList carsMark,
                              CarBodyType carsBodyType,
                              CarsAccessories... additionalAccessories) {
        super(CarsMake.VOLKSWAGEN_GROUP, MANUFACTURE_YEAR, ENGINE_CAPACITY, color, wheelSize, additionalAccessories);
        this.carsMark = carsMark;
        this.carsBodyType = carsBodyType;
    }

    public CarsMarksList getCarsMark() {
        return carsMark;
    }

    public CarBodyType getCarsBodyType() {
        return carsBodyType;
    }

    @Override
    public String toString() {
        return "VolkswagenGroupCar{" +
                "carsMark=" + carsMark +
                ", carsBodyType=" + carsBodyType +
                '}';
    }
}
