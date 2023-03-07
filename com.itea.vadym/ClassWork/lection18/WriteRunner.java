package ClassWork.lection18;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteRunner {
    public static void main(String[] args) {
        String pArray[] = {"2022", " - ", "Java SE 19"};
        var fByte = new File("C:\\Users\\user\\IdeaRepository\\itea\\com.itea.vadym\\ClassWork\\data\\byte.data");
        var fSymbol = new File("C:\\Users\\user\\IdeaRepository\\itea\\com.itea.vadym\\ClassWork\\data\\symbol.txt");

        try (var fileOutputStream = new FileOutputStream(fByte);
             var fileWriter = new FileWriter(fSymbol)) {
            for (String a : pArray) {
                fileOutputStream.write(a.getBytes(StandardCharsets.UTF_8));
                fileWriter.write(a);
            }
        } catch (IOException e) {
            System.err.println("Помилка запису: " + e);
        }
    }
}
