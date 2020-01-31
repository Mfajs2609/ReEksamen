package com.example.demo.controller.view;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;

@Controller
    @EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
    public class viewController {

        Book book;
        @Autowired
        BookRepository bookRepository;

        @GetMapping(value = "/")
        public String getToStartPage() {
            return "index.html";
        }

        @GetMapping(value = "/books")
        public String booksOverview(Model model){
            model.addAttribute("books", bookRepository.findAll());
            return "books.html";
        }

        @GetMapping(value = "/createBooks")
        public String getCreateBook(){
            return "createBook.html";
        }

        @GetMapping(value = "/updateBook{id}")
        public String getUpdateBook(@PathVariable("id")Long bookId, Model model){
            Book book = bookRepository.findBookById(bookId);
            model.addAttribute("id", book.getId());
            model.addAttribute("title", book.getTitle());
            model.addAttribute("author", book.getAuthor());
            model.addAttribute("isbn", book.getIsbn());
            model.addAttribute("numberOfPages", book.getNumberOfPages());
            System.out.println(book);
            return "update.html";
        }

        @PostMapping(value = "createBooks")
        public String createBook(@Valid @ModelAttribute Book book, HttpServletResponse response, ServletRequest request) throws ServletException, IOException {
            bookRepository.save(book);
            RequestDispatcher rd = request.getRequestDispatcher("books.html");
            rd.include(request, response);
            response.setHeader("Refresh", "0; URL=http://localhost:8080/books");
            return "books.html";
        }

        @PostMapping("/updateBook{id}")
        public String updateBook(@Valid @ModelAttribute Book book, @PathVariable("id") Long bookId, HttpServletResponse response, ServletRequest request) throws Exception {
        Book updatedBook = bookRepository.findBookById(bookId);

        updatedBook.setTitle(book.getTitle());
        updatedBook.setAuthor(book.getAuthor());
        updatedBook.setIsbn(book.getIsbn());
        updatedBook.setNumberOfPages(book.getNumberOfPages());

        bookRepository.save(updatedBook);

        RequestDispatcher rd = request.getRequestDispatcher("books.html");
        rd.include(request, response);
        response.setHeader("Refresh", "0; URL=http://localhost:8080/books");
        return "books.html";
        }

}
