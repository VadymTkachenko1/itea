package HomeTask.lection9;//Task 6

import java.util.ArrayList;
import java.util.Date;

public class Catalog {
    ArrayList<BookInformation> books = new ArrayList<>();
    void addBookInformation (String bookName, Date date, String clientName) {
        BookInformation newBook = new BookInformation(bookName, date, clientName);
        books.add(newBook);
    }
    static class BookInformation {
        String bookName;
        Date date;
        String clientName;
        public BookInformation (String bookName, Date date, String clientName) {
            this.bookName = bookName;
            this.date = date;
            this.clientName = clientName;
        }
    }
}