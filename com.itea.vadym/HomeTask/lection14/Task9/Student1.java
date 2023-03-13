package HomeTask.lection14.Task9;

/*
9. Створити клас Student, у якому такі характеристики – ім'я, група, курс, оцінки з предметів.
   Створити колекцію, яка містить об'єкти класу Student.
   Написати метод, який видаляє студентів із середнім балом <3.
   Якщо середній бал>=3, студент переводиться на наступний курс.
   Напишіть метод printStudents(List<Student> students, int course), який отримує список студентів та номер курсу.
   А також друкує на консоль імена тих студентів зі списку, які навчаються на цьому курсі.
 */

public class Student1 {
    private String name;
    private int group;
    private int course;
    private double grade;

    public Student1(String name, int group, int course, double grade) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.grade = grade;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return  "Student name: " + name +
                ", Group: " + group +
                ", Course: " + course +
                ", Grade: " + String.format ("%.2f", grade);
    }
}
