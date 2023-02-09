package HomeTask.lection9;

//Task 5

import java.util.ArrayList;

public class Department {
    ArrayList<EmployeeInformation> employees = new ArrayList<>();
    void addEmployeeInformation (String name, String surname, String post) {
        EmployeeInformation newEmployee = new EmployeeInformation(name, surname, post);
        employees.add(newEmployee);
    }
    static class EmployeeInformation {
        String name;
        String surname;
        String post;
        public EmployeeInformation (String name, String surname, String post) {
            this.name = name;
            this.surname = surname;
            this.post = post;
        }
    }
}