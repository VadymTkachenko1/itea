package HomeTask.lection2;

import java.util.Scanner;

// Задача №7

public class PuzzleTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Що то є таке: синє, велике, з вусами та повне зайців?");
        int attempts = 3;
        while (attempts > 0) {
            String puzzle = scanner.next();
            switch (puzzle) {
                case "Тролейбус" -> {
                    System.out.println("Правильно!");
                    attempts = 0;
                }
                case "Здаюсь" -> {
                    System.out.println("Правильна відповідь: Тролейбус");
                    attempts = 0;
                }
                default -> {
                    System.out.println("Подумайте ще");
                    attempts--;
                }
            }
        }
    }
}