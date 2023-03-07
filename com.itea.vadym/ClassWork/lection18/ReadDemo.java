package ClassWork.lection18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {
    public static void main(String[] args) {
        var filePath = "C:\\Users\\user\\IdeaRepository\\itea\\com.itea.vadym\\ClassWork\\data\\file.txt";
        var file = new File(filePath);
        int b, count = 0;

        try (FileReader fileReader = new FileReader(file)) {
            while ((b = fileReader.read()) != -1) {
                System.out.println((char) b);
                count++;
            }
            System.out.println("\n Числов байтів = " + count);
        } catch (FileNotFoundException e) {
            System.err.println("Помилка файлу: " + e);
        } catch (IOException e) {
            System.err.println("Помилка читання: " + e);
        }
    }
}
