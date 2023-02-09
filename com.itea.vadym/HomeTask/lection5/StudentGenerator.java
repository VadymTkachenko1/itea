package HomeTask.lection5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class StudentGenerator {
    Random random = new Random();
    public Object getStudent () {
        return new Student(nameGeneration(), surnameGeneration(), ageGeneration(), idGeneration(), ratingGeneration(), facultyGeneration(), yearGeneration());
    }
    public ArrayList<Student> getGroup(int studentsCount){
        ArrayList<Student> returnGroup = new ArrayList<>();
        for (int i = 0; i < studentsCount; i++){
            returnGroup.add((Student) getStudent());
        }
        returnGroup.sort(Comparator.comparing(Student -> Student.surname));
        System.out.println(returnGroup);
        return returnGroup;
    }
    private int idCounter = 0;
    private String nameGeneration () {
        String[] existNames = {"Данило", "Артем", "Кирило", "Тетяна", "Аліна", "Анна"};
        return existNames[random.nextInt(0, 5)];
    }
    private String surnameGeneration () {
        String[] existSurnames = {"Шевченко", "Карпенко", "Рябко", "Кравець", "Візеренко", "Бугай"};
        return existSurnames[random.nextInt(0,5)];
    }
    private int ageGeneration () {
        return random.nextInt(18,21);
    }
    private int idGeneration () {
        idCounter = idCounter + 1;
        return idCounter;
    }
    private double ratingGeneration () {
        return random.nextDouble(40,100);
    }
    private String facultyGeneration () {
        String[] existFaculties = {"Математичному", "Історичному", "Біологічному", "Металургійному", "Юридичному", "Економічному"};
        return existFaculties[random.nextInt(0, 5)];
    }
    private int yearGeneration () {
        int returnYear = 0;
        switch (ageGeneration()){
            case 18 -> returnYear = 2023;
            case 19 -> returnYear = 2022;
            case 20 -> returnYear = 2021;
            case 21 -> returnYear = 2020;
        }
        return returnYear;
    }
}