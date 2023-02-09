package HomeTask.lection1;

import javax.swing.*;

public class Hello {
    public static void main(String[] args) {

        // Оголошення змінних

        String name = "Vadym";
        int age = 18;
        String city = "Zaporozhye";

        // Програма, що виводить на екран рік народження мого друга

        int currentYear = 2022;
        int birthYear = currentYear - age;
        JOptionPane.showMessageDialog(null , "Рік народження мого друга - " + birthYear);
    }
}