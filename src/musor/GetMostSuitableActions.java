//package musor;
//
//import mainCharacteristics.Car;
//import mainCharacteristics.CarsMake;
//import prodaction_sale_services.dealership.UniversalDealership;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//public class GetMostSuitableActions {
//    public class GetMostSuitableCarActions implements ActionsWihCar {
//        @Override
//        public Car run() {
//            System.out.println("Введите марку автомобиля, которую вы хотите получить: ");
//            CarsMake[] carsMakes = CarsMake.values();
//            System.out.println("Доступные марки автомобилей: ");
//            for (CarsMake carsMake : carsMakes) {
//                System.out.print(carsMakes.getValue() + ", ");
//            }
//            System.out.println();
//            Scanner scanner = new Scanner(System.in);
//            String makeInput = scanner.nextLine();
//            boolean isCorrectMake = Arrays.stream(carsMakes)
//                    .map(carsMake -> carsMakes.getValue().toUpperCase(Locale.ROOT))
//                    .collect(Collectors.toList())
//                    .contains(makeInput.toUpperCase(Locale.ROOT));
//            CarsMake carsMake;
//            if (isCorrectMake ) {
//                carsMake = CarsMake.valueOf(makeInput.toUpperCase(Locale.ROOT));
//            } else {
//                System.out.println("Автомобиль указанной марки отсутствует на складе: " + makeInput);
//                return null;
//            }
//            System.out.println("Введите цвет: ");
//
//            List<String> availableMakeColors = CarsMatcher.(model);
//            System.out.println("Доступные цвета для данной модели: " + availableModelColors);
//            String colorInput = scanner.next();
//            System.out.println("Введите год: ");
//
//            int yearInput = scanner.nextInt();
//            System.out.println("Введите размер колес: ");
//
//            List<Integer> availableModelWheelSizes = CarsMatcher.getAvailableModelWheelSizes(model);
//            System.out.println("Доступные размеры колес: " + availableModelWheelSizes);
//
//            Integer wheelSizeInput = scanner.nextInt();
//            System.out.println("Введите объём двигателя: ");
//
//            List<Double> availableModelEngineVolumes = CarsMatcher.getAvailableModelEngineVolumes(model);
//            System.out.println("Доступные объёмы двигателей: " + availableModelEngineVolumes);
//            double engineVolumesInput = scanner.nextDouble();
//            System.out.println("Введите список опций через пробел: ");
//
//            List<String> optionsInput = new ArrayList<>();
//            scanner.nextLine();
//
//            StringTokenizer stringTokenizer = new StringTokenizer(scanner.nextLine());
//            while (stringTokenizer.hasMoreElements()) {
//                optionsInput.add(stringTokenizer.nextToken());
//            }
//            UniversalDealership salon = new UniversalDealership();
//            Car carOrder;
//            try {
//                carOrder = salon.getMostSuitableCar(colorInput, optionsInput, model, yearInput, wheelSizeInput, engineVolumesInput);
//            } catch (IllegalArgumentException e) {
//                System.out.println(e.getMessage());
//                return null;
//            }
//            System.out.println("Автомобиль получен");
//            return carOrder;
//        }
//    }
//}
