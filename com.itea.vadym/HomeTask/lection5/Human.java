package HomeTask.lection5;

public class Human {
    String name;
    String surname;
    int age;

    public Human(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    public void printHumanInformation() {
        System.out.println(returnHumanInformation());
    }
    public String returnHumanInformation() {
        if (age == 21){
            return surname + " " + name + ", " + age + "рік";
        } else {
            return surname + " " + name + ", " + age + "років";
        }
    }
}