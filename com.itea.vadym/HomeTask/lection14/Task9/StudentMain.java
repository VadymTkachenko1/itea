package HomeTask.lection14.Task9;

/*
9. Створити клас Student, у якому такі характеристики – ім'я, група, курс, оцінки з предметів.
   Створити колекцію, яка містить об'єкти класу Student.
   Написати метод, який видаляє студентів із середнім балом <3.
   Якщо середній бал>=3, студент переводиться на наступний курс.
   Напишіть метод printStudents(List<Student> students, int course), який отримує список студентів та номер курсу.
   А також друкує на консоль імена тих студентів зі списку, які навчаються на цьому курсі.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        StudentGenerator studentGenerator = new StudentGenerator();
        Scanner scanner = new Scanner(System.in);
        List<Student1> course1 = new ArrayList<>();
        List<Student1> course2 = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            course1.add(studentGenerator.getStudent());
        }

        List<Student1> allStudents = new ArrayList<>(course1);
        courseOperation(course1, course2);
        listOutPrint(course1, course2);
        System.out.println("Enter course");
        printStudents(allStudents, scanner.nextInt());
    }

    private static void printStudents(List<Student1> students, int course) {
        System.out.println("All students on " + course + " course:");
        for (Student1 student : students){
            if (student.getCourse() == course){
                System.out.println(student);
            }
        }
    }

    private static void courseOperation(List<Student1> course1, List<Student1> course2) {
        for (Student1 i : course1) {
            if (i.getGrade() >= 3) {
                course2.add(i);
            }
        }
        course1.removeIf(i -> i.getGrade() > 3);
        for (int i = 0; i < course2.size(); i++) {
            course2.get(i).setCourse(2);
        }
    }
    private static void listOutPrint(List<Student1> course1, List<Student1> course2) {
        System.out.println("Course 1:");
        for (Student1 i : course1) {
            System.out.println(i);
        }
        System.out.println("Course 2:");
        for (Student1 i : course2) {
            System.out.println(i);
        }
    }
}
