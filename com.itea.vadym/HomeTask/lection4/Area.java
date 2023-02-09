package HomeTask.lection4;

//ObjectTask2

public class Area {
    double sideLength;
    double sideWidth;

    Area(double sideLength, double sideWidth){
        this.sideLength = sideLength;
        this.sideWidth = sideWidth;
    }

    double returnArea (double sideLength, double sideWidth){
        return sideLength * sideWidth;
    }
}