package HomeTask.lection7;

public class BaseConverter {
    public double convert(String operation, double temperature) {
        switch (operation.toUpperCase()) {
            case "C - K" -> {
                temperature = temperature + 273.15;
                System.out.println(temperature);
            }
            case "С - F" -> {
                temperature = (temperature * 9 / 5) + 32;
                System.out.println(temperature);
            }
            case "K - C" -> {
                temperature = temperature - 273.15;
                System.out.println(temperature);
            }
            case "F - C" -> {
                temperature = (temperature - 32) * 5 / 9;
                System.out.println(temperature);
            }
            case "K - F" -> {
                temperature = (temperature - 273.15) * 9 / 5 + 32;
                System.out.println(temperature);
            }
            case "F - K" -> {
                temperature = (temperature - 32) * 5 / 9 + 273.15;
                System.out.println(temperature);
            }
        }
        return temperature;
    }
}