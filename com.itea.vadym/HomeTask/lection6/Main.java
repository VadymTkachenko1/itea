package HomeTask.lection6;

public class Main {
    static UkrainianHen ukrainianHen = new UkrainianHen();
    static HenFactory henFactory = new HenFactory(ukrainianHen);

    public static void main(String[] args) {
        System.out.println(henFactory.getHen());
    }
}