package volvo;
import prodaction_sale_services.CarFactory;
import prodaction_sale_services.CarStorage;
import prodaction_sale_services.dealership.DealershipOrder;
import prodaction_sale_services.services.*;
import mainCharacteristics.*;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;


public class VolvoCarFactory extends CarFactory {

    private PassengerCarsModels[] passengerCarsModels;
    private HorsePower[] horsePowers;

    public VolvoCarFactory(CarsMake[] carsMakes,
                           CarsColor[] carsColors,
                           EngineCapacityList[] engineCapacityList,
                           WheelSizeList[] wheelSizeLists,
                           CarStorage carStorage,
                           AddCarAccessoriesService addCarAccessoriesService,
                           RemoveCarAccessoriesService removeCarAccessoriesService,
                           PaintingService paintingService,
                           WheelReplacementService wheelReplacementService,
                           PassengerCarsModels[] passengerCarsModels,
                           HorsePower[] horsePowers) {
        super(carsMakes,
                carsColors,
                engineCapacityList,
                wheelSizeLists,
                carStorage,
                addCarAccessoriesService,
                removeCarAccessoriesService,
                paintingService,
                wheelReplacementService);
        this.passengerCarsModels = passengerCarsModels;
        this.horsePowers = horsePowers;
    }

    @Override
    public void printCarFactoryOpportunities() {
        super.printCarFactoryOpportunities();
        System.out.println("Модель автомобиля: " + Arrays.toString(passengerCarsModels));
        System.out.println("Мощность л.с.: " + Arrays.toString(horsePowers));
    }

    @Override
    protected boolean checkCarCharacteristicsForOpportunityToCreate (DealershipOrder dealershipOrder) {
        super.checkCarCharacteristicsForOpportunityToCreate(dealershipOrder);
        for (PassengerCarsModels existent : this.passengerCarsModels) {
            if (existent.equals(passengerCarsModels)) {
                return true;
            } else {
                return false;
            }
        }
        for (HorsePower existent : this.horsePowers) {
            if (existent.equals(horsePowers)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

}
