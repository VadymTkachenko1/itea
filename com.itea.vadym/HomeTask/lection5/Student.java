package HomeTask.lection5;

public class Student extends Human {
    int id;
    double rating;
    String faculty;
    int entryYear;
    public Student(String name, String surname, int age, int id, double rating, String faculty, int entryYear) {
        super(name, surname, age);
        this.id = id;
        this.rating = rating;
        this.faculty = faculty;
        this.entryYear = entryYear;
    }

    @Override
    public String toString() {
        return "Студент " + surname + " " + name + ", рейтинг - " + String.format ("%.2f", rating);
    }
    public String returnStudentInformation() {
        return "Id: " + id + ", рейтинг: " + rating + " вчиться на " + faculty + " факультеті" + ", поступив у " + entryYear;
    }
    @Override
    public void printHumanInformation() {
        System.out.println(returnHumanInformation() + returnStudentInformation());
    }
}