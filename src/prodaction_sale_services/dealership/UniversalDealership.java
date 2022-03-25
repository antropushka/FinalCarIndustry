package prodaction_sale_services.dealership;

import bmw.CarsModels;
import bmw.CountryOfProduction;
import mainCharacteristics.*;
import prodaction_sale_services.CarFactory;
import prodaction_sale_services.Factories;
import prodaction_sale_services.services.AddCarAccessoriesService;
import prodaction_sale_services.services.PaintingService;
import prodaction_sale_services.services.RemoveCarAccessoriesService;
import prodaction_sale_services.services.WheelReplacementService;
import volkswagenGroup.CarBodyType;
import volkswagenGroup.CarsMarksList;
import volvo.HorsePower;
import volvo.PassengerCarsModels;

public class UniversalDealership {

    private final Factories factories;
    private final AddCarAccessoriesService addCarAccessoriesService;
    private final RemoveCarAccessoriesService removeCarAccessoriesService;
    private final PaintingService paintingService;
    private final WheelReplacementService wheelReplacementService;

    public UniversalDealership(Factories factories,
                               AddCarAccessoriesService addCarAccessoriesService,
                               RemoveCarAccessoriesService removeCarAccessoriesService,
                               PaintingService paintingService,
                               WheelReplacementService wheelReplacementService) {
        this.factories = factories;
        this.addCarAccessoriesService = addCarAccessoriesService;
        this.removeCarAccessoriesService = removeCarAccessoriesService;
        this.paintingService = paintingService;
        this.wheelReplacementService = wheelReplacementService;
    }


    public void changeCarCharacteristic (Car car, CarsColor carsColor) {
        paintingService.provideService(car, carsColor);
    }

    public void changeCarCharacteristic (Car car, WheelSizeList wheelSize) {
        wheelReplacementService.provideService(car, wheelSize);
    }

    public void changeCarCharacteristic (Car car, CarsColor carsColor, WheelSizeList wheelSize) { // если не совпало 2 параметра, меняем их
        paintingService.provideService(car, carsColor);
        wheelReplacementService.provideService(car, wheelSize);
    }

    public void additionalAccessories (Car car, CarsAccessories...additionalAccessories) {
        if (additionalAccessories.length > 0) {
        addCarAccessoriesService.provideService(car,additionalAccessories);
        }
    }

    public void additionalAccessories (Car car, CarsAccessories...additionalAccessories) {
        if (additionalAccessories.length > 0) {
            removeCarAccessoriesService.provideService(car,additionalAccessories);
        }
    }

    public Car clientOrder (CarsMake MAKE,
                            Integer MANUFACTURE_YEAR,
                            EngineCapacityList ENGINE_CAPACITY,
                            CarsColor color, WheelSizeList wheelSize,
                            CarsModels carsModels,
                            CountryOfProduction countryOfProduction,
                            CarsAccessories... additionalAccessories) {
    return factories.clientOrderFullfillment(new DealershipOrder(MAKE, MANUFACTURE_YEAR, ENGINE_CAPACITY, color,
            wheelSize, carsModels, countryOfProduction, additionalAccessories));
    }


    public Car clientOrder (CarsMake MAKE,
                            Integer MANUFACTURE_YEAR,
                            EngineCapacityList ENGINE_CAPACITY,
                            CarsColor color,
                            WheelSizeList wheelSize,
                            CarsMarksList carsMark,
                            CarBodyType carsBodyType,
                            CarsAccessories... additionalAccessories) {
        return factories.clientOrderFullfillment(new DealershipOrder(MAKE, MANUFACTURE_YEAR, ENGINE_CAPACITY, color,
                wheelSize, carsMark, carsBodyType, additionalAccessories));

    }

    public Car clientOrder (CarsMake MAKE,
                            Integer MANUFACTURE_YEAR,
                            EngineCapacityList ENGINE_CAPACITY,
                            CarsColor color, WheelSizeList wheelSize,
                            PassengerCarsModels passengerCarsModels,
                            HorsePower horsePower,
                            CarsAccessories... additionalAccessories) {
        return factories.clientOrderFullfillment(new DealershipOrder(MAKE, MANUFACTURE_YEAR, ENGINE_CAPACITY, color,
                wheelSize, passengerCarsModels, horsePower, additionalAccessories));

    }
}
