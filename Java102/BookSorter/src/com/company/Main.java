package com.company;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>();

        books.add(new Book(600,"Suç ve Ceza", "Fyodor Dostoyevski", "1866"));
        books.add(new Book(300,"Cesur Yeni Dünya","Aldous Huxley", "1932"));
        books.add(new Book(500,"İstanbul Hatırası","Ahmet Ümit", "2010"));
        books.add(new Book(200,"Yeraltından Notlar", "Fyodor Dostoyevski", "1864"));
        books.add(new Book(400,"Tutunamayanlar" ,"Oğuz Atay","1972" ));

        System.out.println("Sorted with Book Page Number");
        for (Book book : books) {
            System.out.println(book.getPageNumber());
        }

        TreeSet<Book> books2 = new TreeSet<>(new CompareWithName());
        books2.addAll(books);

        for (Book book : books2) {
            System.out.println(book.getName());
        }
    }
}
