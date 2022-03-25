package bmw;
import prodaction_sale_services.CarFactory;
import prodaction_sale_services.CarStorage;
import prodaction_sale_services.dealership.DealershipOrder;
import prodaction_sale_services.services.*;
import mainCharacteristics.*;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class BMWCarFactory extends CarFactory {

    private CarsModels[] BMWCarsModels;
    private CountryOfProduction[] countryOfProductions;


    public BMWCarFactory(CarsMake[] carsMakes,
                         CarsColor[] carsColors,
                         EngineCapacityList[] engineCapacityList,
                         WheelSizeList[] wheelSizeLists,
                         CarStorage carStorage,
                         AddCarAccessoriesService addCarAccessoriesService,
                         RemoveCarAccessoriesService removeCarAccessoriesService,
                         PaintingService paintingService,
                         WheelReplacementService wheelReplacementService,
                         CarsModels[] BMWCarsModels,
                         CountryOfProduction[] countryOfProductions) {
        super(carsMakes,
                carsColors,
                engineCapacityList,
                wheelSizeLists,
                carStorage,
                addCarAccessoriesService,
                removeCarAccessoriesService,
                paintingService,
                wheelReplacementService);
        this.BMWCarsModels = BMWCarsModels;
        this.countryOfProductions = countryOfProductions;
    }

    @Override
    public void printCarFactoryOpportunities() {
        super.();
        System.out.println("Модели автомобилей: " + Arrays.toString(BMWCarsModels));
        System.out.println("Страна производства: " + Arrays.toString(countryOfProductions));
    }


    @Override
    protected boolean checkCarCharacteristicsForOpportunityToCreate(DealershipOrder dealershipOrder) {
        super.checkCarCharacteristicsForOpportunityToCreate (dealershipOrder);
        for (CarsModels existent : this.BMWCarsModels) {
            if (existent.equals(BMWCarsModels)) {
                return true;
            } else {
                return false;
            }
        }
        for (CountryOfProduction existent : this.countryOfProductions) {
            if (existent.equals(countryOfProductions)) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

}
