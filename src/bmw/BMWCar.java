package bmw;
import mainCharacteristics.*;

public class BMWCar extends Car{

    private final CarsModels carsModels;
    private final CountryOfProduction countryOfProduction;

    public BMWCar(CarsMake MAKE,
                  Integer MANUFACTURE_YEAR,
                  EngineCapacityList ENGINE_CAPACITY,
                  CarsColor color,
                  WheelSizeList wheelSize,
                  CarsModels carsModels,
                  CountryOfProduction countryOfProduction) {
        super(CarsMake.BMW, MANUFACTURE_YEAR, ENGINE_CAPACITY, color, wheelSize);
        this.carsModels = carsModels;
        this.countryOfProduction = countryOfProduction;
    }

    public BMWCar(CarsMake MAKE,
                  Integer MANUFACTURE_YEAR,
                  EngineCapacityList ENGINE_CAPACITY,
                  CarsColor color,
                  WheelSizeList wheelSize,
                  CarsModels carsModels,
                  CountryOfProduction countryOfProduction,
                  CarsAccessories...additionalAccessories) {
        super(CarsMake.BMW, MANUFACTURE_YEAR, ENGINE_CAPACITY, color, wheelSize, additionalAccessories);
        this.carsModels = carsModels;
        this.countryOfProduction = countryOfProduction;
    }

    public CarsModels getCarsModels() {
        return carsModels;
    }

    public CountryOfProduction getCountryOfProduction() {
        return countryOfProduction;
    }

    @Override
    public String toString() {
        return "BMWCar{" +
                "carsModels=" + carsModels +
                ", countryOfProduction=" + countryOfProduction +
                '}';
    }
}



