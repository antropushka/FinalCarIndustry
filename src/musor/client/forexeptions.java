
//        try {
//            if (MAKE == null)
//                throw new ExeptionsInCarCreation("Марка автомобиля введена не корректно. Данная фабрика выпускает" +
//                        "автомобили исключительно марки BMW");
//        } catch (ExeptionsInCarCreation e) {
//            MAKE = CarsMake.BMW;
//            System.err.println(e.getMessage());
//            System.err.println("Установлена марка автомобиля по умолчанию BMW");
//        }
//        try {
//            if (MANUFACTURE_YEAR < 2010 || MANUFACTURE_YEAR > 2022)
//                throw new ExeptionsInCarCreation("Год выпуска автомобиля введен не корректно.");
//        } catch (ExeptionsInCarCreation e) {
//            System.err.println(e.getMessage());
//            if (MANUFACTURE_YEAR < 2010) {
//                MANUFACTURE_YEAR = 2010;
//                System.err.println("Автомобиле с годом выпуска ранее, чем 2010 г, не доступны к заказу.");
//            } else {
//                MANUFACTURE_YEAR = 2022;
//                System.err.println("К заказу доступны автомобили с годом выпуска не позже текущего года.");
//            }
//        }
//        try {
//            if (ENGINE_CAPACITY == null)
//                throw new ExeptionsInCarCreation("Объём двигателя автомобиля введен не корректно.");
//        } catch (ExeptionsInCarCreation e) {
//            ENGINE_CAPACITY = EngineCapacityList.V1_6;
//            System.err.println(e.getMessage());
//            System.err.println("Объёмом двигателя по умолчанию является объём 1.5");
//        }
//        try {
//            if (wheelSize == null)
//                throw new ExeptionsInCarCreation("Размер колес автомобиля введен не корректно.");
//        } catch (ExeptionsInCarCreation e) {
//            wheelSize = WheelSizeList.IN15.;
//            System.err.println(e.getMessage());
//            System.err.println("Размер колес по умолчанию равер 15 IN");
//        }
//        try {
//            if (color == null)
//                throw new ExeptionsInCarCreation("Цвет для автомобиля введен не корректно");
//        } catch (ExeptionsInCarCreation e) {
//            color = CarsColor.WHITE;
//            System.err.println(e.getMessage());
//            System.err.println("Цвет автомобиля по умолчанию: WHITE");
//        }
//        try {
//            if (carsModels == null)
//                throw new ExeptionsInCarCreation("Модель для автомобиля введена не корректно");
//        } catch (ExeptionsInCarCreation e) {
//            carsModels = CarsModels.SERIES_1;
//            System.err.println(e.getMessage());
//            System.err.println("Цвет автомобиля по умолчанию: SERIES_1");
//        }
//        try {
//            if (countryOfProduction == null)
//                throw new ExeptionsInCarCreation("Страна проозводства для автомобиля введена не корректно");
//        } catch (ExeptionsInCarCreation e) {
//            countryOfProduction = CountryOfProduction.GERMANY;
//            System.err.println(e.getMessage());
//            System.err.println("Цвет автомобиля по умолчанию: GERMANY");
//        }
//        BMWCar carBMW = new BMWCar(MAKE,
//                MANUFACTURE_YEAR,
//                ENGINE_CAPACITY,
//                color,
//                wheelSize,
//                carsModels,
//                countryOfProduction);
//        return carBMW;
//    }

