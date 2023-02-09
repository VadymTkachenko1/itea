package HomeTask.lection9;

//Task 8

import java.util.ArrayList;

public class City {
    ArrayList<CityInformation> cities = new ArrayList<>();
    void addCityInformation (String street, String avenue, String citySquare) {
        CityInformation newCityInformation = new CityInformation(street, avenue, citySquare);
        cities.add(newCityInformation);
    }
    static class CityInformation {
        String street;
        String avenue;
        String citySquare;
        public CityInformation (String street, String avenue, String citySquare) {
            this.street = street;
            this.avenue = avenue;
            this.citySquare = citySquare;
        }
    }
}