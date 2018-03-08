package com.twu.biblioteca;

import java.util.ArrayList;

public class Customer {
    Librarian librarian = Librarian.getInstance();

    public Customer(){}

    public ArrayList<Book> getArrayList(){
        return librarian.getBookList();
    }

    public void display(){
        for(int i=0; i<librarian.getBookList().size(); i++)
            System.out.println(librarian.getBookList().get(i).getTitle());
    }
    public boolean successfulCheckout(Book book) {
        if (librarian.getBookList().contains(book)) {
            librarian.getBookList().remove(book);
            System.out.println("Thank you! Enjoy the book");
            return true;
        }
        else{
            System.out.println("That book is not available.");
            return false;
        }
    }

    public boolean successfulReturn(Book book){
        librarian.getBookList().add(book);
        System.out.println("Thank you for returning the book.");
        return true;
    }

    public boolean unsuccessfulReturn(Book book){
        if(!librarian.getBookList().contains(book)){
            System.out.println("That is not a valid book to return.");
            return false;
        }
        else{return true;}
    }
}
