package org.ac.bibliotheque.books.service.interfaces;

import org.ac.bibliotheque.books.domain.dto.BookDto;
import org.ac.bibliotheque.books.domain.entity.Book;

public interface BookService {

    Book save(Book book);
    Book update(Book book);
    Book getBookById(Long id);
    Book getBookByBookName(String bookName);
    Book getBookByIsbn(Long isbn);
    Book getBookByAuthotName(String authorName);
    Book getBookByAuthorSurname(String authorsurname);

    void deleteBookById(Long id);
    void deleteBookByIsbn(Long isbn);
    void deleteBookByBookName(String bookName);

    BookDto addBook(BookDto book);
}
