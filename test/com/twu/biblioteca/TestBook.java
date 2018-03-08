package com.twu.biblioteca;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestBook {
    @Test
    public void shouldReturnBookDetails(){
        Book bookOne = new Book("Head First Java", "Kathy Sierra", "2008");
        assertThat(bookOne.bookDetails(), is(String.format("Head First Java,Kathy Sierra,2008")));

        Book bookTwo = new Book("Test Driven Development", "Kent Beck", "2004");
        assertThat(bookTwo.bookDetails(), is(String.format("Test Driven Development,Kent Beck,2004")));
    }
}
