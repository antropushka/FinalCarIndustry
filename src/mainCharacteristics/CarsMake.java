package mainCharacteristics;

public enum CarsMake {
    VOLKSWAGEN_GROUP ("ФольсвагенГрупп"),
    BMW ("БМВ"),
    VOLVO ("ВОЛЬВО")
    ;

    private final String carsMake;

    CarsMake(String carsMake) {
        this.carsMake = carsMake;
    }

    public String getCarsMake() {
        return carsMake;
    }
}


