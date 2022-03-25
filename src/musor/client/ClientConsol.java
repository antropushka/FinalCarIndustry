//package musor.client;
//
//import musor.ChangeActionsWithCar;
//import musor.CreateActionsWithCar;
//import musor.GetMostSuitableActions;
//import mainCharacteristics.Car;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class ClientConsol {
//    public static Map<Integer, Car> clientCars = new HashMap<>();
//    public static final String EXIT_COMMAND = "EXIT";
//    public static Map<Integer, Command> commands = new HashMap<>();
//
//    static {
//        Command createCarCommand = new Command("Создать машину", new CreateActionsWithCar());
//        commands.put(commands.size() + 1, createCarCommand);
//        Command getMostSuitableCarCommand = new Command("Получить на складе наиболее подходящую машину",
//                new GetMostSuitableActions());
//        commands.put(commands.size() + 1, getMostSuitableCarCommand);
//        Command changeCarCommand = new Command("Изменить автомобиль", new ChangeActionsWithCar());
//        commands.put(commands.size() + 1, changeCarCommand);
//    }
//
//    public static void run() {
//        printHead();
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String nextCommand = scanner.next();
//            if (nextCommand.equals(EXIT_COMMAND)) {
//                return;
//            }
//            Integer commandIndex = Integer.valueOf(nextCommand);
//            Command command = commands.get(commandIndex);
//            if (command != null) {
//                try {
//                    Car car = command.getAction().run();
//                    if (car != null) {
//                        clientCars.put(clientCars.size() + 1, car);
//                    }
//                } catch (Exception e) {
//                    System.out.println("Данные введены неверно");
//                }
//            }
//            if (clientCars.size() > 0) {
//                printClientsCar();
//            }
//            printHead();
//        }
//    }
//
//    public static void printHead() {
//        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
//        System.out.println("Вы можете ввести следующие комманды из списка: ");
//        commands.entrySet().stream().forEach(entry -> {
//            System.out.println(entry.getKey() + ": " + entry.getValue().getDescription());
//        });
//    }
//
//    public static void printClientsCar() {
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        System.out.println("Автомобили клиента: ");
//        clientCars.entrySet().stream().forEach(entry -> {
//            System.out.println(entry.getKey() + ": ");
//            entry.getValue().printCar();
//        });
//
//    }
//}