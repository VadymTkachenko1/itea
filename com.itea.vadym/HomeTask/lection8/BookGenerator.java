package HomeTask.lection8;

//Завдання 1

import java.util.Random;

public class BookGenerator {
    Random random = new Random();
    String authorCheck = bookNameGenerator ();
    Book book = new Book(authorCheck, authorGenerator(), publisherGenerator(), priceGenerator());
    private String bookNameGenerator () {
        String [] bookName = {"Кобзар", "Кайдашева сім'я", "Чорна Рада", "Intermezzo", "Лісова пісня"};
        return bookName[random.nextInt(0,4)];
    }

    private String authorGenerator () {
        String returnAuthor = "";
        switch (authorCheck){
            case "Кобзар" -> returnAuthor = "Тарас Шевченко";
            case "Кайдашева сім'я" -> returnAuthor = "Іван Нечуй-Левицький";
            case "Чорна Рада" -> returnAuthor = "Пантелеймон Куліш";
            case "Intermezzo" -> returnAuthor = "Михайло Коцюбинський";
            case "Лісова пісня" -> returnAuthor = "Леся Українка";
        }
        return returnAuthor;
    }
    private String publisherGenerator () {
        String [] publisher = {"Кавун", "ЛИРА", "Видавництво Анетти Антоненко", "Книгарня", "Видавництво Старого Лева"};
        return publisher[random.nextInt(0,4)];
    }
    private int priceGenerator () {
        int price = random.nextInt(0, 20);
        if (price < 10) {
            price = 10;
            System.out.println("Ціна менше 10, автоматично присвоєно 10");
        }
        return price;
    }

    @Override
    public String toString () {
        return "Назва книги: " + book.getBookName() + "\nАвтор: " + book.getAuthorName() + "\nВидавець: " +
                book.getPublisherName() + "\nЦіна: " + book.getPrice();
    }
}