package musor.actionsWithCar;

public class ExeptionsInCarCreation extends Exception {

    public ExeptionsInCarCreation() {
    }

    public ExeptionsInCarCreation(String message) {
        super(message);
    }

    public ExeptionsInCarCreation(String message, Throwable cause) {
        super(message, cause);
    }

    public ExeptionsInCarCreation(Throwable cause) {
        super(cause);
    }

    public ExeptionsInCarCreation(String message, Throwable cause,
                                  boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
