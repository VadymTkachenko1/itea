package HomeTask.lection9;

//Task 9

import java.util.ArrayList;

public class BlueRayDisc {
    ArrayList<BlueRayInformation> blueRays = new ArrayList<>();
    void addBlueRayInformation (String directory, String subdirectory, String text) {
        BlueRayInformation newBlueRay = new BlueRayInformation(directory, subdirectory, text);
        blueRays.add(newBlueRay);
    }
    static class BlueRayInformation {
        String directory;
        String subdirectory;
        String text;
        public BlueRayInformation (String directory, String subdirectory, String text) {
            this.directory = directory;
            this.subdirectory = subdirectory;
            this.text = text;
        }
    }
}