package com.company.BookValidation.Models;

import javax.validation.constraints.NotBlank;

public class Book {

    @NotBlank(message = "Book must have a Title.")
    private String title;

    @NotBlank(message = "Book must have an Author")
    private String author;

    @NotBlank(message = "Book must have an ISBN")
    private String isbn;

    private BookGenre genre;

    public Book (){

    }

    public Book(String title, String author, String isbn, BookGenre type) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.genre = type;
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
}
