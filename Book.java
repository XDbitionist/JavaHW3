package org.example.hw3;

import java.util.ArrayList;
import java.util.List;

//Для решения этой задачи нужно проанализировать каждую книгу и проверить, соответствует ли она заданным условиям.
//        Для этого можно использовать цикл и проверку каждого поля книги.

public class Book {
    private String title;
    private String author;
    private double price;
    private int year;
    private int pages;

    public Book(String title, String author, double price, int year, int pages) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public int getPages() {
        return pages;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        books.add(new Book("Book1", "AuthorA", 10.0, 2012, 101));
        books.add(new Book("Book2", "AuthorB", 20.0, 2011, 102));
        books.add(new Book("Book3", "AuthorC", 30.0, 2010, 103));
        books.add(new Book("Book4", "AuthorD", 40.0, 2013, 104));

        for (Book book : books) {
            if (isInterestingBook(book)) {
                System.out.println(book.getTitle());
            }
        }
    }

    public static boolean isInterestingBook(Book book) {
        boolean isPrime = true;
        int n = book.getPages();
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime && book.getAuthor().contains("A") && book.getYear() >= 2010;
    }
}

//    В данном примере мы создаем класс Book для хранения информации о книгах. В методе main создаем список книг и проверяем каждую книгу на соответствие заданным условиям с помощью метода isInterestingBook. Этот метод проверяет, является ли количество страниц простым числом, содержит ли фамилия автора букву "А" и была ли книга издана после 2010 года. Если все условия выполнены, метод возвращает true, в противном случае - false.
//    Если книга является интересной, то мы выводим ее название на экран.
//    Обратите внимание, что в данном примере мы реализуем метод для проверки простоты числа isPrime, чтобы использовать его в методе isInterestingBook.
