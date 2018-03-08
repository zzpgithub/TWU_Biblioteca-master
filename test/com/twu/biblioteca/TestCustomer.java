package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestCustomer {
    @Test
    public void shouldReturnSuccessfulCheckout(){
        Customer customer = new Customer();
        Book bookFalse = new Book("java","someone","2001");
        assertFalse(customer.successfulCheckout(bookFalse));

        Book bookReal = new Book("Head First Java", "Kathy Sierra", "2008");
        assertTrue(customer.successfulCheckout(bookReal));
    }

    @Test
    public void shouldReturnBookSuccessfulReturn(){
        Customer customer = new Customer();
        Book bookCheckOut = new Book("Head First Java", "Kathy Sierra", "2008");
        customer.successfulCheckout(bookCheckOut);

        assertTrue(customer.successfulReturn(bookCheckOut));
        //customer.display();
    }

    @Test
    public void shouldReturnBookUnsuccessfulReturn(){
        Customer customer = new Customer();
        Book bookNotRight = new Book("java","someone","2001");
        assertFalse(customer.unsuccessfulReturn(bookNotRight));
    }
}
