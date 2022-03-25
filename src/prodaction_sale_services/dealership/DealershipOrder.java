package prodaction_sale_services.dealership;
import bmw.CarsModels;
import bmw.CountryOfProduction;
import mainCharacteristics.*;
import volkswagenGroup.CarBodyType;
import volkswagenGroup.CarsMarksList;
import volvo.HorsePower;
import volvo.PassengerCarsModels;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class DealershipOrder {

    private CarsMake MAKE;
    private final Integer MANUFACTURE_YEAR;
    private final EngineCapacityList ENGINE_CAPACITY;
    private final CarsColor color;
    private final WheelSizeList wheelSize;
    private final Set<CarsAccessories> additionalAccessories;
    private CarsModels carsModels;
    private CountryOfProduction countryOfProduction;
    private CarsMarksList carsMark;
    private CarBodyType carsBodyType;
    private PassengerCarsModels passengerCarsModels;
    private HorsePower horsePower;

    public DealershipOrder(CarsMake MAKE,
                           Integer MANUFACTURE_YEAR,
                           EngineCapacityList ENGINE_CAPACITY,
                           CarsColor color, WheelSizeList wheelSize,
                           CarsModels carsModels,
                           CountryOfProduction countryOfProduction,
                           CarsAccessories... additionalAccessories) {
        MAKE = CarsMake.BMW;
        this.MANUFACTURE_YEAR = MANUFACTURE_YEAR;
        this.ENGINE_CAPACITY = ENGINE_CAPACITY;
        this.color = color;
        this.wheelSize = wheelSize;
        this.additionalAccessories = Arrays.stream(additionalAccessories).collect(Collectors.toSet());
        this.carsModels = carsModels;
        this.countryOfProduction = countryOfProduction;
    }

    public DealershipOrder(CarsMake MAKE,
                           Integer MANUFACTURE_YEAR,
                           EngineCapacityList ENGINE_CAPACITY,
                           CarsColor color,
                           WheelSizeList wheelSize,
                           CarsMarksList carsMark,
                           CarBodyType carsBodyType,
                           CarsAccessories... additionalAccessories) {
        MAKE = CarsMake.VOLKSWAGEN_GROUP;
        this.MANUFACTURE_YEAR = MANUFACTURE_YEAR;
        this.ENGINE_CAPACITY = ENGINE_CAPACITY;
        this.color = color;
        this.wheelSize = wheelSize;
        this.additionalAccessories = Arrays.stream(additionalAccessories).collect(Collectors.toSet());
        this.carsMark = carsMark;
        this.carsBodyType = carsBodyType;
    }

    public DealershipOrder(CarsMake MAKE,
                           Integer MANUFACTURE_YEAR,
                           EngineCapacityList ENGINE_CAPACITY,
                           CarsColor color, WheelSizeList wheelSize,
                           PassengerCarsModels passengerCarsModels,
                           HorsePower horsePower,
                           CarsAccessories... additionalAccessories) {
        MAKE = CarsMake.VOLVO;
        this.MANUFACTURE_YEAR = MANUFACTURE_YEAR;
        this.ENGINE_CAPACITY = ENGINE_CAPACITY;
        this.color = color;
        this.wheelSize = wheelSize;
        this.additionalAccessories = Arrays.stream(additionalAccessories).collect(Collectors.toSet());
        this.passengerCarsModels = passengerCarsModels;
        this.horsePower = horsePower;
    }

    public CarsMake getMAKE() {
        return MAKE;
    }

    public Integer getMANUFACTURE_YEAR() {
        return MANUFACTURE_YEAR;
    }

    public EngineCapacityList getENGINE_CAPACITY() {
        return ENGINE_CAPACITY;
    }

    public CarsColor getColor() {
        return color;
    }

    public WheelSizeList getWheelSize() {
        return wheelSize;
    }

    public Set<CarsAccessories> getAdditionalAccessories() {
        return additionalAccessories;
    }

    public CarsModels getCarsModels() {
        return carsModels;
    }

    public CountryOfProduction getCountryOfProduction() {
        return countryOfProduction;
    }

    public CarsMarksList getCarsMark() {
        return carsMark;
    }

    public CarBodyType getCarsBodyType() {
        return carsBodyType;
    }

    public PassengerCarsModels getPassengerCarsModels() {
        return passengerCarsModels;
    }

    public HorsePower getHorsePower() {
        return horsePower;
    }
}


