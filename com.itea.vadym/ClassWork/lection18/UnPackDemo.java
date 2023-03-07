package ClassWork.lection18;

public class UnPackDemo {
    public static void main(String[] args) {
        String nameJar = "example.jar";
        String destinationPath = "c\\temp\\";

        new UnPackJar().unPack(destinationPath, nameJar);
    }
}
