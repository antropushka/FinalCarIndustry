package prodaction_sale_services;

import bmw.BMWCar;
import bmw.CarsModels;
import bmw.CountryOfProduction;
import mainCharacteristics.*;
import prodaction_sale_services.dealership.DealershipOrder;
import volkswagenGroup.CarBodyType;
import volkswagenGroup.CarsMarksList;
import volkswagenGroup.VolkswagenGroupCar;
import volvo.HorsePower;
import volvo.PassengerCarsModels;
import volvo.VolvoCar;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;


public class CarStorage {

    private final List<Car> carStorage;



    public CarStorage(List<Car> carStorage) {
        this.carStorage = new ArrayList<>();
        carStorage.add(new BMWCar(CarsMake.BMW, 2021, EngineCapacityList.V1_6, CarsColor.RED,
                WheelSizeList.IN19, CarsModels.M5, CountryOfProduction.GERMANY));
        carStorage.add(new BMWCar(CarsMake.BMW, 2019, EngineCapacityList.V2_0, CarsColor.BLUE,
                WheelSizeList.IN17, CarsModels.SERIES_5, CountryOfProduction.MALAYSIA));
        carStorage.add(new VolvoCar(CarsMake.VOLVO, 2018, EngineCapacityList.V2_4, CarsColor.GREEN,
                WheelSizeList.IN18, PassengerCarsModels.C30, HorsePower.HP_190));
        carStorage.add(new VolvoCar(CarsMake.VOLVO, 2017, EngineCapacityList.V1_8, CarsColor.ORANGE,
                WheelSizeList.IN18, PassengerCarsModels.S90, HorsePower.HP_235));
        carStorage.add(new VolkswagenGroupCar(CarsMake.VOLKSWAGEN_GROUP, 2019, EngineCapacityList.V2_0,
                CarsColor.WHITE, WheelSizeList.IN20, CarsMarksList.BUGATTI, CarBodyType.SEDAN));
        carStorage.add(new VolkswagenGroupCar(CarsMake.VOLKSWAGEN_GROUP, 2020, EngineCapacityList.V2_0,
                CarsColor.BLACK, WheelSizeList.IN18, CarsMarksList.VOLSWAGEN, CarBodyType.JEEP));
    }

    public List<Car> getCarStorage() {
        synchronized (carStorage) {
            return carStorage;
        }
    }

    public void addCarInTheStorage (Car car) {
        synchronized (carStorage) {
            carStorage.add(car);
        }
    }
    // здесь по логике должна была находиться сначала машина по параметрам, характерным для всех, а потом по индвидидуальным,
    // но видимо джава не мое и все пошло не так, но я пыталась)))))))
    public int searchCarInTheStorage(DealershipOrder dealershipOrder) {
        try {
            if (carStorage.size() > 0) {
                switch (dealershipOrder.getMAKE()) {
                    case BMW -> {
                        return searchBMWCarInTheStorage(dealershipOrder);
                    }
                    case VOLKSWAGEN_GROUP -> {
                        return searchVolkswagenGroupCarInTheStorage(dealershipOrder);
                    }
                    case VOLVO -> {
                        return searchVolvoCarInTheStorage(dealershipOrder);
                    }
                }
            }
        } catch (NullPointerException e) {

        }
        return -1;
        }
    // находим машину, которая совпадает посностью по параметрам с абсрактной машиной или частично (неизменяемые хар-ки)
    private int searchCarInTheStorage(DealershipOrder dealershipOrder) throws NullPointerException,
            NoSuchElementException {
        for (int i = 0; i < carStorage.size(); i++) {
            if (carStorage.get(i).getMAKE().equals(dealershipOrder.getMAKE())
                    && carStorage.get(i).getColor().equals(dealershipOrder.getColor())
                    && carStorage.get(i).getWheelSize().equals(dealershipOrder.getWheelSize())
                    && carStorage.get(i).getENGINE_CAPACITY().equals(dealershipOrder.getENGINE_CAPACITY())) {
                return carStorage.indexOf(i);
            } else if (carStorage.get(i).getMAKE().equals(dealershipOrder.getMAKE())
                    && carStorage.get(i).getWheelSize().equals(dealershipOrder.getWheelSize())) {
                return carStorage.indexOf(i);
            }
            return -1;
        }
    }

    private searchBMWCarInTheStorage (DealershipOrder dealershipOrder) throws NullPointerException,
            NoSuchElementException {

    }

    private int searchVolkswagenGroupCarInTheStorage(DealershipOrder dealershipOrder) throws NullPointerException,
            NoSuchElementException  {

    }
//
//    carStorage.stream()
//            .filter(car -> car.getMAKE().equals(dealershipOrder.getMAKE())
//                    && car.getColor().equals(dealershipOrder.getColor())
//                    && car.getWheelSize().equals(dealershipOrder.getWheelSize())
//                    && car.getENGINE_CAPACITY().equals(dealershipOrder.getENGINE_CAPACITY()))
//            .filter(car -> (BMWCar) car.get
//
//                    BMWCar
//    private int searchVolvoCarInTheStorage(DealershipOrder dealershipOrder) throws NullPointerException,
//            NoSuchElementException  {
//        return carStorage.indexOf()
//
//    }

        public Car RelocateCarFromTheStorage (int index) {
            synchronized (carStorage) {
                return carStorage.remove(index);
            }
        }
    }




//    @Override
//    public String toString() {
//        System.out.println("[=======Склад автомобилей=======]");
//        StringBuilder stringBuilder= new StringBuilder();
//        int count = 1;
//        int iMax = carStorage.size() - 1;
//        for (int i = 0; ; i++) {
//            stringBuilder.append("\n" + "_________________________________" + "\n" + "Номер автомобиля на складе: " + count
//                    + "\n" + "---------------------------------" + "\n");
//            count++;
//            stringBuilder.append(carStorage.get(i).toString());
//            if (i == iMax) {
//                return stringBuilder.append(' ').toString();
//            }
//        }
//    }
