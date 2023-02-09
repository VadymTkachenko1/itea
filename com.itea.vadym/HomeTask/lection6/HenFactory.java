package HomeTask.lection6;

public class HenFactory {
    Hen chicken;
    public HenFactory (Hen Hen) {
        this.chicken = Hen;
    }
    public String getHen () {
        return chicken.getCountry();
    }
}