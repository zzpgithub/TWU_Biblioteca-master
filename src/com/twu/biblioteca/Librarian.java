package com.twu.biblioteca;
import java.util.ArrayList;

public class Librarian {

    private static ArrayList<Book> bookList = new ArrayList<Book>();

    private static final Librarian librarian = new Librarian();
    private Librarian(){
        this.bookList.add(new Book("Head First Java", "Kathy Sierra", "2008"));
        this.bookList.add(new Book("Test Driven Development", "Kent Beck", "2004"));
    }
    public static Librarian getInstance()
    {
        return librarian;
    }

    public static ArrayList<Book> getBookList() {
        return bookList;
    }

    public void dispaly(){
        for(int i=0; i<bookList.size(); i++)
            System.out.println(bookList.get(i).getTitle());
    }

    public boolean checkoutBook(Book book){
        if(bookList.contains(book)){
            bookList.remove(book);
            System.out.println("Checked out books");
            return true;
        }
        else{
            System.out.println("No checked out");
            return false;
        }

    }
}
