package com.sda.testingbasics.bookstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

class BasketTest {

    private Basket basket;


    @BeforeEach
    void beforeEach(){
       basket = new Basket();
    }


    @Test
    void shouldBeEmpty(){


       int size = basket.size();
       assertEquals(0, size);
    }

    @Test
    void shouldAddBook() {

        //create new book
        Book book = new Book("Potop", "Sienkiewicz", 45);
        //add book to basket
        basket.add(book);
        //check if basket size is 1
        int size = basket.size();
        assertEquals(1, size);
    }

    @Test
    void shouldReturnAllAddedBooks(){

        //add 3 books
        Book book1 = new Book("Potop", "Sienkiewicz", 45);
        Book book2 = new Book("Ogniem i Mieczem", "Sienkiewicz", 20);
        Book book3 = new Book("Pan Wołodyjowski", "Sienkiewicz", 25);
        basket.add(book1);
        basket.add(book2);
        basket.add(book3);

        //when - get all books
        Collection<Book> retrievedBooks = basket.getAll();


        //then verify that 3 books are returned and these are exactly the same books
        assertEquals(3, retrievedBooks.size());
        assertTrue(retrievedBooks.contains(book1));
        assertTrue(retrievedBooks.contains(book2));
        assertTrue(retrievedBooks.contains(book3));

        assertThat(retrievedBooks)
                .hasSize(3)
                .containsExactlyInAnyOrder(book1, book2, book3);
    }

    @Test
    void shouldBePossibleToClearBasket(){
        //create basket
        //beforeEach


        //add 3 books
        Book book1 = new Book("Potop", "Sienkiewicz", 45);
        Book book2 = new Book("Ogniem i Mieczem", "Sienkiewicz", 20);
        Book book3 = new Book("Pan Wołodyjowski", "Sienkiewicz", 25);
        basket.add(book1);
        basket.add(book2);
        basket.add(book3);

        //clear basket
        basket.clear();

        //verify that size is 0
        assertEquals(0, basket.size());
    }

    @Test
    void shouldCalculateBasketValue(){
        //add 3 books
        Book book1 = new Book("Potop", "Sienkiewicz", 45);
        Book book2 = new Book("Ogniem i Mieczem", "Sienkiewicz", 20);
        Book book3 = new Book("Pan Wołodyjowski", "Sienkiewicz", 25);
        basket.add(book1);
        basket.add(book2);
        basket.add(book3);

        //calculate value
        double totalValue = basket.getTotalValue();

        assertEquals(90, totalValue);
    }

}