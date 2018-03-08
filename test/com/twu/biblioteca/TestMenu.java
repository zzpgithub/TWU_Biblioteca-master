package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestMenu {
    @Test
    public void shouldReturnMenu(){
        Menu menu = new Menu("list books");
        menu.dispaly();
    }

    @Test
    public void shouldReturnInvalidMenuOption(){
        Menu menu = new Menu("list books");
        assertFalse(menu.invalidMenuOption("Invalid"));
    }

    @Test
    public void shouldReturnQuit(){
        Menu menu = new Menu("list books");
        assertTrue(menu.quit("Quit"));
    }
}
