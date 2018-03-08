package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
//        System.out.println(WelcomeMessage.welcomeMessage());
        System.out.println("Hello, world!");
        Menu menu = new Menu("book list");
        menu.dispaly();
    }
}
