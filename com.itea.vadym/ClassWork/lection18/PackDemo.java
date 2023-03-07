package ClassWork.lection18;

import java.io.FileNotFoundException;

public class PackDemo {
    public static void main(String[] args) {
        var dirName = "com.itea.vadym/ClassWork/lection18";
        var packJar = new PackJar("example.jar");

        try {
            packJar.pack(dirName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
