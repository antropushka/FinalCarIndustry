package volkswagenGroup;
import prodaction_sale_services.CarFactory;
import prodaction_sale_services.CarStorage;
import prodaction_sale_services.dealership.DealershipOrder;
import prodaction_sale_services.services.*;
import mainCharacteristics.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class VolkswagenGroupFactory extends CarFactory {

    private CarsMarksList[] carsMarksLists;
    private CarBodyType[] carBodyTypes;

    public VolkswagenGroupFactory(CarsMake[] carsMakes,
                                  CarsColor[] carsColors,
                                  EngineCapacityList[] engineCapacityList,
                                  WheelSizeList[] wheelSizeLists,
                                  CarStorage carStorage,
                                  AddCarAccessoriesService addCarAccessoriesService,
                                  RemoveCarAccessoriesService removeCarAccessoriesService,
                                  PaintingService paintingService,
                                  WheelReplacementService wheelReplacementService,
                                  CarsMarksList[] carsMarksLists,
                                  CarBodyType[] carBodyTypes) {
        super(carsMakes,
                carsColors,
                engineCapacityList,
                wheelSizeLists,
                carStorage,
                addCarAccessoriesService,
                removeCarAccessoriesService,
                paintingService,
                wheelReplacementService);
        this.carsMarksLists = carsMarksLists;
        this.carBodyTypes = carBodyTypes;
    }

    @Override
    public void printCarFactoryOpportunities() {
        super.printCarFactoryOpportunities();
        System.out.println("Марки автомобилей: " + Arrays.toString(carsMarksLists));
        System.out.println("Типы кузовов выпускаемых автомобилей: " + Arrays.toString(carBodyTypes));
    }


    @Override
    protected boolean checkCarCharacteristicsForOpportunityToCreate (DealershipOrder dealershipOrder) {
       super.checkCarCharacteristicsForOpportunityToCreate(dealershipOrder);
        for (CarsMarksList existent : this.carsMarksLists) {
            if (existent.equals(carsMarksLists)) {
                return true;
            } else {
                return false;
            }
        }
        for (CarBodyType existent : this.carBodyTypes) {
            if (existent.equals(carBodyTypes)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}

