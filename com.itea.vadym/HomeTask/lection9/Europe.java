package HomeTask.lection9;//Task 7

import java.util.ArrayList;
import java.util.Date;

public class Europe {
    ArrayList<TerritorialInformation> countries = new ArrayList<>();
    void addTerritorialInformation (String country, String text, Date date) {
        TerritorialInformation newInformation = new TerritorialInformation(country, text, date);
        countries.add(newInformation);
    }
    static class TerritorialInformation {
        String country;
        String text;
        Date date;
        public TerritorialInformation (String country, String text, Date date) {
            this.country = country;
            this.text = text;
            this.date = date;
        }
    }
}