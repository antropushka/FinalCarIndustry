package volkswagenGroup;

public enum CarBodyType {
    HATCHBACK ("Hatchback"),
    SEDAN ("Sedan"),
    SUV ("Sport-utiliy vehicle"),
    COUPE ("Coupe"),
    CONVERTIBLE ("Convertible"),
    WAGON ("Wagon"),
    VAN ("Van"),
    JEEP ("Jeep")
    ;

    private final String carBobyType;

    CarBodyType(String carBobyType) {
        this.carBobyType = carBobyType;
    }

    public String getCarBobyType() {
        return carBobyType;
    }
}
