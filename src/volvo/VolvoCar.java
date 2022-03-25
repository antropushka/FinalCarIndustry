package volvo;
import mainCharacteristics.*;

import java.util.List;
import java.util.Set;

public class VolvoCar extends Car {

    private PassengerCarsModels passengerCarsModels;
    private HorsePower horsePower;

    public VolvoCar(CarsMake make,
                    Integer manufactureYear,
                    EngineCapacityList engineCapacity,
                    CarsColor color,
                    WheelSizeList wheelSize,
                    PassengerCarsModels passengerCarsModels,
                    HorsePower horsePower) {
        super(CarsMake.VOLVO, manufactureYear, engineCapacity, color, wheelSize);
        this.passengerCarsModels = passengerCarsModels;
        this.horsePower = horsePower;
    }

    public VolvoCar(CarsMake make,
                    Integer manufactureYear,
                    EngineCapacityList engineCapacity,
                    CarsColor color,
                    WheelSizeList wheelSize,
                    PassengerCarsModels passengerCarsModels,
                    HorsePower horsePower,
                    CarsAccessories... additionalAccessories) {
        super(CarsMake.VOLVO, manufactureYear, engineCapacity, color, wheelSize, additionalAccessories);
        this.passengerCarsModels = passengerCarsModels;
        this.horsePower = horsePower;
    }

    public PassengerCarsModels getPassengerCarsModels() {
        return passengerCarsModels;
    }

    public HorsePower getHorsePower() {
        return horsePower;
    }

    @Override
    public String toString() {
        return "VolvoCar{" +
                "passengerCarsModels=" + passengerCarsModels +
                ", horsePower=" + horsePower +
                '}';
    }
}