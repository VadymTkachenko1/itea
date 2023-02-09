package HomeTask.lection6;

public class MoldovanHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + ", моя крайїна - " + getCountry() + ", я несу " + getCountOfEggsPerMonth() + " яєць в місяць";
    }

    @Override
    String getCountry() {
        return "Молдова";
    }

    @Override
    int getCountOfEggsPerMonth() {
        return 12;
    }
}