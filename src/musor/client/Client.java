package musor.client;

public class Client {
    public class Command {
        private String description;
        private Runnable action;
        private CarAction action;

        public Command(String description, Runnable action) {
     public Command(String description, CarAction action) {
                this.description = description;
                this.action = action;
            }
            @@ -17,7 +13,7 @@ public String getDescription() {
                return description;
            }

            public Runnable getAction() {
                public CarAction getAction() {
                    return action;
                }
}
