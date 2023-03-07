package ClassWork.lection18;

import java.io.InvalidObjectException;

public class RunnerSerialization {
    public static void main(String[] args) {
        Student student = new Student("MMF", "Goncharenko", 1, "G017s9");
        System.out.println(student);

        var filePath = "C:\\Users\\user\\IdeaRepository\\itea\\com.itea.vadym\\ClassWork\\data\\demo.data";
        var serializator = new Serializator();
        var result = serializator.serialization(student, filePath);

        Student.faculty = "GEO";
        Student res = null;

        try {
            res = serializator.deSerialization(filePath);
        } catch (InvalidObjectException e) {
            e.printStackTrace();
        }
        System.out.println(res);
    }
}
