package volvo;

public enum HorsePower {
    HP_136 (136),
    HP_163 (163),
    HP_190 (190),
    HP_235 (235),
    HP_249 (249),
    HP_320 (320),
    ;

    private final Integer horsePower;

    HorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
}
