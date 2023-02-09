package HomeTask.lection5;

import java.util.ArrayList;
import java.util.Scanner;

public class Group {
    ArrayList<Student> students;
    public Group (ArrayList<Student> group) {
        this.students = group;
    }
    StudentGenerator studentGenerator = new StudentGenerator();
    Scanner scanner = new Scanner(System.in);
    public void studentSearch (String inputSearch) {
        Student student;
        ArrayList<Student> foundStudents = new ArrayList<>();
        for (Student value : students) {
            if (inputSearch.equalsIgnoreCase(value.surname)) {
                student = value;
                foundStudents.add(student);
            }
        }
        System.out.println(foundStudents);
    }
    public void studentManipulation (String inputAction) {
        int idDelete;
        switch (inputAction){
            case "+" -> {
                students.add((Student) studentGenerator.getStudent());
                System.out.print(students);
            }
            case "-" -> {
                System.out.println("Введіть id студента, якого хочете видалити");
                idDelete = scanner.nextInt();
                idDelete--;
                students.remove(idDelete);
                System.out.print(students);
            }
        }
    }
}