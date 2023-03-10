package HomeTask.lection15;

/*
ДЗ

Розробити багатопотоковий консольний додаток.
Використовувати можливості, які надає пакет java.util.concurrent.
Не використовувати слово synchronized.
Усі сутності, які бажають отримати доступ до ресурсу, мають бути потоками.
Використовувати можливості ООП.

Завод та поїзди.

Поїзди під'їжджають для розвантаження/завантаження контейнерів (метал або готовий виріб).
Кількість контейнерів, що знаходяться зараз на заводі та поїзді, не повинна бути негативною
і не перевищувати задану вантажопідйомність поїзда та місткість складу заводу.
На заводі кілька під'їздів для навантаження/вивантаження.
В одного під'їзду для навантаження/вивантаження може стояти один поїзд.
Поїзд може завантажуватися біля під'їзду, розвантажуватись або виконувати обидві дії.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Generator generator = new Generator();
        Factory factory = new Factory(generator.generateFactory().getContainersInStock());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter train amount to generate");
        int trainAmount = scanner.nextInt();

        ArrayList<Train> trains = new ArrayList<>();
        for (int i = 0; i < trainAmount; i++) {
            trains.add(generator.generateTrain());
        }
        factory.handleTrains(trains);
    }
}
