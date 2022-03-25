package musor;

import musor.client.ClientConsol;
import mainCharacteristics.Car;
import prodaction_sale_services.dealership.UniversalDealership;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ChangeActionsWithCar {
    public class ChangeCarAction implements ActionsWihCar {

        @Override
        public Car run() {
            UniversalDealership universalDealership = new UniversalDealership();
            System.out.println("Введите номер машины которую хотите изменить: ");
            Scanner scanner = new Scanner(System.in);
            int carIndex = scanner.nextInt();
            Car car = ClientConsol.clientCars.get(carIndex);
            if (car == null) {
                System.out.println("Неверный индекс. Машины под таким индексом не сущестсвует");
                return null;
            }
            System.out.println("Текущий цвет: " + car.getColor()
                    + ". Если хотите изменить цвет введите true иначе false");
            boolean isColorShouldBeChanged = scanner.nextBoolean();
            if (isColorShouldBeChanged) {
                System.out.println("Введите цвет: ");
                List<String> availableModelColors = CarsMatcher.getAvailableModelColors(car.getMAKE());
                System.out.println("Доступные цвета для данной марки автомобиля: " + availableModelColors);
                String colorInput = scanner.next();
                try {
                    universalDealership.changeCarColor(car, colorInput);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return null;
                }
            }
            System.out.println("Текущий размер колёс: " + car.getWheelSize()
                    + " Если хотите изменить размер колёс введите true, если необходимо оставить текущий размер колес, " +
                    "введите false");
            boolean isWheelSizeShouldBeChanged = scanner.nextBoolean();
            if (isWheelSizeShouldBeChanged) {
                System.out.println("Введите размер колес: ");
                List<Integer> availableModelWheelSizes = CarsMatcher.getAvailableModelWheelSizes(car.getMAKE());
                System.out.println("Доступные размеры колес: " + availableModelWheelSizes);
                Integer wheelSizeInput = scanner.nextInt();
                try {
                    universalDealership.changeCarWheelSize(car, wheelSizeInput);
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    return null;
                }
            }
            System.out.println("Текущий список опций: " + car.getOptions()
                    + " Если хотите изменить список опций введите true, если необходимо оставить текущий список, введите " +
                    "false");
            boolean isOptionsShouldBeChanged = scanner.nextBoolean();
            if (isOptionsShouldBeChanged) {
                System.out.println("Введите список опций через запятую: ");
                List<String> optionsInput = new ArrayList<>();
                scanner.nextLine();
                StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine(), ",");
                while (stringTokenizer.hasMoreElements()) {
                    optionsInput.add(stringTokenizer.nextToken());
                }
                universalDealership.changeCarOptions(car, optionsInput);
            }
            ClientConsol.clientCars.remove(carIndex);
            ClientConsol.clientCars.put(carIndex, car);
            System.out.println("Машина изменена");
            return null;
        }
    }
}
