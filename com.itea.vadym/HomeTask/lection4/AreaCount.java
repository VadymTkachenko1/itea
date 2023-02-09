package HomeTask.lection4;

//ObjectTask2

import java.util.Scanner;

public class AreaCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sideLength = scanner.nextInt();
        double sideWidth = scanner.nextInt();

        Area areaCount = new Area(sideLength, sideWidth);

        double area = areaCount.returnArea(areaCount.sideLength, areaCount.sideWidth);
        System.out.println(area);
    }
}