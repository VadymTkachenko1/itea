package HomeTask.lection6;

public class PolishHen extends Hen{
    @Override
    String getDescription() {
        return super.getDescription() + ", моя крайїна - " + getCountry() + ", я несу " + getCountOfEggsPerMonth() + " яєць в місяць";
    }

    @Override
    String getCountry() {
        return "Польща";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 11;
    }
}