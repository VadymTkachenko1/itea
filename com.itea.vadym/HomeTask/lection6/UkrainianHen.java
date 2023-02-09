package HomeTask.lection6;

public class UkrainianHen extends Hen{
    @Override
    String getDescription() {
        return super.getDescription() + ", моя крайїна - " + getCountry() + ", я несу " + getCountOfEggsPerMonth() + " яєць в місяць";
    }

    @Override
    String getCountry() {
        return "Україна";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 10;
    }
}