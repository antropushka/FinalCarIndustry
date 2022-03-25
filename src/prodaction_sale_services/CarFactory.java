package prodaction_sale_services;

import bmw.BMWCar;
import mainCharacteristics.*;
import prodaction_sale_services.dealership.DealershipOrder;
import prodaction_sale_services.services.AddCarAccessoriesService;
import prodaction_sale_services.services.PaintingService;
import prodaction_sale_services.services.RemoveCarAccessoriesService;
import prodaction_sale_services.services.WheelReplacementService;
import volkswagenGroup.VolkswagenGroupCar;
import volvo.VolvoCar;

import java.util.*;

public abstract class CarFactory {

    private final CarsMake[] carsMakes;
    private final CarsColor[] carsColors;
    private final EngineCapacityList[] engineCapacityList;
    private final WheelSizeList[] wheelSizeList;
    private final CarStorage carStorage;
    private final AddCarAccessoriesService addCarAccessoriesService;
    private final RemoveCarAccessoriesService removeCarAccessoriesService;
    private final PaintingService paintingService;
    private final WheelReplacementService wheelReplacementService;

    public CarFactory(CarsMake[] carsMakes,
                      CarsColor[] carsColors,
                      EngineCapacityList[] engineCapacityList,
                      WheelSizeList[] wheelSizeList,
                      CarStorage carStorage,
                      AddCarAccessoriesService addCarAccessoriesService,
                      RemoveCarAccessoriesService removeCarAccessoriesService,
                      PaintingService paintingService,
                      WheelReplacementService wheelReplacementService) {
        this.carsMakes = carsMakes;
        this.carsColors = carsColors;
        this.engineCapacityList = engineCapacityList;
        this.wheelSizeList = wheelSizeList;
        this.carStorage = new CarStorage();
        this.addCarAccessoriesService = addCarAccessoriesService;
        this.removeCarAccessoriesService = removeCarAccessoriesService;
        this.paintingService = paintingService;
        this.wheelReplacementService = wheelReplacementService;
    }

    public void printCarFactoryOpportunities() {
        System.out.println("На нашем автозаводе выпускаются автомобили со следующими характеристиками: ");
        System.out.println("производители: " + Arrays.toString(carsMakes));
        System.out.println("цвета: " + Arrays.toString(carsColors));
        System.out.println("Объем двигателя: " + Arrays.toString(engineCapacityList));
        System.out.println("размер колес: " + Arrays.toString(wheelSizeList));
    }

    @SuppressWarnings("unchecked")
    public <T extends Car> T createCar(DealershipOrder dealershipOrder) {
        switch (dealershipOrder.getMAKE()) {
            case BMW -> carStorage.addCarInTheStorage(new BMWCar(
                    CarsMake.BMW,
                    Calendar.getInstance().get(Calendar.YEAR),
                    dealershipOrder.getENGINE_CAPACITY(),
                    dealershipOrder.getColor(),
                    dealershipOrder.getWheelSize(),
                    dealershipOrder.getCarsModels(),
                    dealershipOrder.getCountryOfProduction()));
            case VOLKSWAGEN_GROUP -> carStorage.addCarInTheStorage(new VolkswagenGroupCar(
                    CarsMake.VOLKSWAGEN_GROUP,
                    Calendar.getInstance().get(Calendar.YEAR),
                    dealershipOrder.getENGINE_CAPACITY(),
                    dealershipOrder.getColor(),
                    dealershipOrder.getWheelSize(),
                    dealershipOrder.getCarsMark(),
                    dealershipOrder.getCarsBodyType()
            ));
            case VOLVO -> carStorage.addCarInTheStorage(new VolvoCar(
                    CarsMake.VOLVO,
                    Calendar.getInstance().get(Calendar.YEAR),
                    dealershipOrder.getENGINE_CAPACITY(),
                    dealershipOrder.getColor(),
                    dealershipOrder.getWheelSize(),
                    dealershipOrder.getPassengerCarsModels(),
                    dealershipOrder.getHorsePower()));

            default -> throw new IllegalArgumentException();
        }
        return null;
    }

    protected boolean checkCarCharacteristicsForOpportunityToCreate (DealershipOrder dealershipOrder) {
        for (CarsMake existent : this.carsMakes) {
            if (existent.equals(carsMakes)) {
                return true;
            } else {
                return false;
            }
        }
        for (EngineCapacityList existent : this.engineCapacityList) {
            if (existent.equals(engineCapacityList)) {
                return true;
            } else {
                return false;
            }
        }
        for (CarsColor existent : this.carsColors) {
            if (existent.equals(carsColors)) {
                return true;
            } else {
                return false;
            }
        }
        for (WheelSizeList existent : this.wheelSizeList) {
            if (existent.equals(wheelSizeList)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    private Car findCarInTheStorage(DealershipOrder dealershipOrder) {
        int index = carStorage.searchCarInTheStorage(dealershipOrder);
        if (index >= 0) {
            return carStorage.searchCarInTheStorage(index);
        }
        return null;
    }

    protected void changeCarInAccodanceWithDealershipOrder(Car car, DealershipOrder dealershipOrder) {
        if (!car.getColor().equals(dealershipOrder.getColor())) {
            paintingService.provideService(car, dealershipOrder.getColor());
        }
        if (!car.getWheelSize().equals(dealershipOrder.getWheelSize())) {
            wheelReplacementService.provideService(car, dealershipOrder.getWheelSize());
        }
    }

    protected void addCarAccessoriesInAccodanceWithDealershipOrder(Car car, DealershipOrder dealershipOrder) {
        addCarAccessoriesService.provideService(car, dealershipOrder.getAdditionalAccessories().toArray(new CarsAccessories[0]));
    }

    public Car ClientOrderFullfilment(DealershipOrder dealershipOrder) {
        if (checkCarCharacteristicsForOpportunityToCreate(dealershipOrder)) {
            Car car = findCarInTheStorage(dealershipOrder);
            if (car != null) {
                System.out.println("На складе найден автомобиль, который будет приведен в соответствие с Вашим заказом");
                changeCarInAccodanceWithDealershipOrder(car, dealershipOrder);
                if (dealershipOrder.getAdditionalAccessories().size() != 0) {
                    (car, dealershipOrder);
                    System.out.println("Аксессуары добавлены на автомобиль в соответствии с заказом.");
                    ;
                }
                return car;
            } else {
                System.out.println("К сожалению, автомобиль с характеристиками, указанными в заказе, в настоящий момент " +
                        "отсутствует на складе. Однако, в ближайшее время он будет произведен специально для Вас!");
                createCar(dealershipOrder);
            }
            if (dealershipOrder.getAdditionalAccessories().size() != 0) {
                ...
            }
            return carStorage.relocateCarFromTheStorage (carStorage.getCarStorage().size() - 1);
        } else {
            System.out.println("Автомобили с указанными характеристиками не производятся на данном автомобильном заводе!");
        }
    }








