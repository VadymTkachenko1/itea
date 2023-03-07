package ClassWork.lection18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DemoReader {
    public static void main(String[] args) {
        var file = new File("C:\\Users\\user\\IdeaRepository\\itea\\com.itea.vadym\\ClassWork\\data\\res.txt");

        try ( var bufferedreader = new BufferedReader(new FileReader(file))){
            var tmp = "";
            while ((tmp = bufferedreader.readLine()) != null) {
                var strings = tmp.split("\\s");

                for (var string : strings) {
                    System.out.println(string);
                }
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }

}
