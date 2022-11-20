package com.sda.testingbasics.bookstore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Basket {

    private final List<Book> books;

    public Basket() {
        books = new ArrayList<>();
    }

    public int size() {
        return books.size();
    }

    public void add(Book book) {
        books.add(book);
    }

    public void clear() {
        books.clear();

    }

    public Collection<Book> getAll() {
        return new ArrayList<>(books); //tworzymy kopie zeby nie miec bezposredniego dosepu do ksiazek

    }

    public double getTotalValue() {
        double value = 0;
        for (Book book : books) {
            value += book.getPrice();
        }
        return value;
    }
}
