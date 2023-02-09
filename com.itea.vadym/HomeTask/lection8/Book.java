package HomeTask.lection8;

//Завдання 1

public class Book {
    private String bookName;
    private String authorName;
    private String publisherName;
    private int price;

    public Book(String bookName, String authorName, String publisherName, int price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}