package com.company.BookValidation.Controllers;

import com.company.BookValidation.Models.Book;
import com.company.BookValidation.Models.BookGenre;
import com.company.BookValidation.dataRepositores.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/book")
public class BookController {


    // GET /book -> returns a JSON List of all the books
    @GetMapping
    public String getBooks(Model model) {
        model.addAttribute("books", BookRepository.books);
        return "bookList";
    }


    // GET /book/new -> returns an HTML form
    @GetMapping(value = "/new")
    public String addBookForm(Model model) {
        model.addAttribute(new Book());
        model.addAttribute("types", BookGenre.values());
        return "newBookForm";
    }

    // POST /book/new
    @PostMapping(value = "/new")
    public String addBook(@ModelAttribute Book newBook, Model model) {
        BookRepository.addBook(newBook);
        model.addAttribute("bookName", newBook.getTitle());
        return "bookAdded";
    }

    @GetMapping(value = "/search")
    public String searchBooksForm(){
        return "filterBooksForm";
    }

    @PostMapping(value = "/search")
    public String searchBooks(Model model, @RequestParam String type, @RequestParam String keyword){

        model.addAttribute("books", BookRepository.searchBook(type, keyword));
        return "filterBooks";
    }
}