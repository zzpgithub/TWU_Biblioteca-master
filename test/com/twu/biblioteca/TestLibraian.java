package com.twu.biblioteca;

import org.junit.Test;


import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertTrue;

public class TestLibraian {
    @Test
    public void shouldReturnCheckedOut(){
        Librarian librarian = Librarian.getInstance();

        Book book1 = new Book("java","someone","2001");
        assertFalse(librarian.checkoutBook(book1));
//        librarian.dispaly();
        Book book2 = new Book("Test Driven Development", "Kent Beck", "2004");
        librarian.checkoutBook(book2);
        //librarian.dispaly();
        assertTrue(librarian.getBookList().contains(new Book("Head First Java", "Kathy Sierra", "2008")));
    }
}
