package HomeTask.lection9;

//Task 10

import java.util.ArrayList;

public class Mobile {
    ArrayList<MobileInformation> telephones = new ArrayList<>();
    void addMobile (String model, String properties) {
        MobileInformation newMobile = new MobileInformation(model, properties);
        telephones.add(newMobile);
    }
    static class MobileInformation {
        String model;
        String properties;
        public MobileInformation (String model, String properties) {
            this.model = model;
            this.properties = properties;
        }
    }
}