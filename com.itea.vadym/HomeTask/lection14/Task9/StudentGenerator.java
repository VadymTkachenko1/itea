package HomeTask.lection14.Task9;

/*
9. Створити клас Student, у якому такі характеристики – ім'я, група, курс, оцінки з предметів.
   Створити колекцію, яка містить об'єкти класу Student.
   Написати метод, який видаляє студентів із середнім балом <3.
   Якщо середній бал>=3, студент переводиться на наступний курс.
   Напишіть метод printStudents(List<Student> students, int course), який отримує список студентів та номер курсу.
   А також друкує на консоль імена тих студентів зі списку, які навчаються на цьому курсі.
 */

import java.util.Random;

public class StudentGenerator {
    Random random = new Random();
    protected Student1 getStudent() {
        return new Student1(nameGenerator(), groupGenerator(), courseGenerator(), gradeGenerator());
    }

    private String nameGenerator() {
        String[] existNames = {"Данило", "Артем", "Кирило", "Тетяна", "Аліна", "Анна"};
        return existNames[random.nextInt(0, 5)];
    }

    private int groupGenerator() {
        return random.nextInt(1,2);
    }

    private int courseGenerator() {
        return 1;
    }

    private double gradeGenerator() {
        return random.nextDouble(0,5);
    }
}
