package HomeTask.lection6;

public class GreateBritanHen extends Hen{
    @Override
    String getDescription() {
        return super.getDescription() + ", моя крайїна - " + getCountry() + ", я несу " + getCountOfEggsPerMonth() + " яєць в місяць";
    }

    @Override
    String getCountry() {
        return "Великобританія";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 13;
    }
}