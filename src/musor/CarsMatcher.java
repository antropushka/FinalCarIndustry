package musor;

import mainCharacteristics.CarsColor;
import mainCharacteristics.CarsMake;
import mainCharacteristics.EngineCapacityList;
import prodaction_sale_services.CarFactory;
import prodaction_sale_services.Factories;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

public class CarsMatcher {

    public static String colorsMatcher (CarsMake carsMake, CarsColor carColor) {
        for (CarFactory factory : Factories.getFactories()) {
            if (factory..contains(carsMake)) {
                List<String> factoryCarColors = factory.();
                if (!factoryCarColors.contains(carColor)) {
                    throw new IllegalArgumentException("Некорректный цвет " + carColor + " для марки автомобиля: "
                            + carsMake + ". Доступные цвета: " + factoryCarColors);
                }
                return carColor;
            }
        }
        return null;
    }


    public static int yearMatcher(int manufacture_year) {
        Calendar calendar = new GregorianCalendar();
        int currentYear = calendar.get(Calendar.YEAR);
        if (manufacture_year != currentYear) {
            throw new IllegalArgumentException(" Год выпуска автомобиля указан не корректно: " + manufacture_year +
                    ". Год вупуска автобобиля может быть только: " + currentYear);
        }
        return manufacture_year;
    }

    public static EngineCapacityList EngineCapacityMatcher (CarsMake carsMake, EngineCapacityList engineCapacity) {
        for (CarFactory carFactory : Factories.getFactories()) {
            if (carFactory.getCarsMake().contains(carsMake)) {
                List<EngineCapacityList> factoryEngineCapacity = carFactory.getEngineCapacity();
                if (!factoryEngineCapacity.contains(engineCapacity)) {
                    throw new IllegalArgumentException("Не корректныйобъем двигателя " + engineCapacity + " для марки автомобиля: "
                            + carsMake + ". Доступные варианты: " + factoryEngineCapacity);
                }
                return factoryEngineCapacity;
            }
        }
        return 0;
    }

    public static int validateWheelSize(Model model, int wheelSize) {
        for (Factory factory : Factories.getFactories()) {
            if (factory.getModels().contains(model)) {
                List<Integer> factoryWheelSizes = factory.getWheelSizes();
                if (!factoryWheelSizes.contains(wheelSize)) {
                    throw new IllegalArgumentException("Invalid wheelSize: " + wheelSize + " for model: "
                            + model + ". Available wheelSizes: " + factoryWheelSizes);
                }
                return wheelSize;
            }
        }
        return 0;
    }
}
}
