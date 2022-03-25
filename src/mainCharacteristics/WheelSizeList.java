package mainCharacteristics;

public enum WheelSizeList {
    IN15 (15),
    IN16 (16),
    IN17 (17),
    IN18 (18),
    IN19 (19),
    IN20 (20),
    IN29 (29),
    IN32 (32),
    ;

    private final Integer wheelSize;

    WheelSizeList (Integer wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Integer getWheelSize() {
        return wheelSize;
    }


}
