package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestWelcomeMessage {
    @Test
    public void shouldReturnWelcomeMessage() {
        assertEquals("Welcome to Biblioteca!", WelcomeMessage.welcomeMessage());
    }
}
