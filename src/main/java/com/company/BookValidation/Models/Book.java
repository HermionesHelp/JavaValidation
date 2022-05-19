package com.company.BookValidation.Models;

import javax.validation.constraints.NotBlank;

public class Book {

    @NotBlank(message = "Book must have a Title.")
    private String title;

    private String author;

    private String isbn;

    private BookGenre genre;

    private BookType type;

    public Book (){

    }

    public Book(String title, String author, String isbn, BookGenre genre, BookType type) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = genre;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public BookGenre getGenre() {
        return genre;
    }

    public void setGenre(BookGenre genre) {
        this.genre = genre;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }
}
