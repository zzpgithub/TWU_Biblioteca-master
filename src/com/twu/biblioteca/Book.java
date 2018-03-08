package com.twu.biblioteca;


public class Book {
    private String title;
    private String author;
    private String year;

    public Book(String title, String author, String year){
        this.title = title;
        this.author = author;
        this.year = year;

    }

    public String getTitle() {
        return this.title;
    }

    public String bookDetails() {
        return String.format(title+ "," +author + "," + year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return this.title.equals(book.title) &&
                this.author.equals(book.author) &&
                this.year.equals(book.year);
    }
}
