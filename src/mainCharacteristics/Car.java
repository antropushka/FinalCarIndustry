package mainCharacteristics;

import java.util.*;
import java.util.stream.Collectors;

public class Car {

    private final CarsMake MAKE;
    private final Integer MANUFACTURE_YEAR;
    private final EngineCapacityList ENGINE_CAPACITY;
    private CarsColor color;
    private WheelSizeList wheelSize;
    private Set <CarsAccessories> additionalAccessories;

    public Car(CarsMake MAKE,
               Integer MANUFACTURE_YEAR,
               EngineCapacityList ENGINE_CAPACITY,
               CarsColor color,
               WheelSizeList wheelSize) {
        this.MAKE = MAKE;
        this.MANUFACTURE_YEAR = MANUFACTURE_YEAR;
        this.ENGINE_CAPACITY = ENGINE_CAPACITY;
        this.color = color;
        this.wheelSize = wheelSize;
        this.additionalAccessories = new HashSet<>();
    }

    public Car(CarsMake MAKE,
               Integer MANUFACTURE_YEAR,
               EngineCapacityList ENGINE_CAPACITY,
               CarsColor color,
               WheelSizeList wheelSize,
               CarsAccessories... additionalAccessories) {
        this.MAKE = MAKE;
        this.MANUFACTURE_YEAR = MANUFACTURE_YEAR;
        this.ENGINE_CAPACITY = ENGINE_CAPACITY;
        this.color = color;
        this.wheelSize = wheelSize;
        this.additionalAccessories = Arrays.stream(additionalAccessories).collect(Collectors.toSet());
    }

    public void setColor(CarsColor color) {
        this.color = color;
    }

    public void setWheelSize(WheelSizeList wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setAdditionalAccessories (Set<CarsAccessories> additionalAccessories) {
        this.additionalAccessories = additionalAccessories;
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
}
