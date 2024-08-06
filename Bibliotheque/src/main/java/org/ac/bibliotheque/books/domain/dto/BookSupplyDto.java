package org.ac.bibliotheque.books.domain.dto;

import java.util.Objects;

public class BookSupplyDto {

    private Long id;
    private String bookName;
    private String authorName;
    private String authorSurname;
    private String publisher;
    private String isbn;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorSurname() {
        return authorSurname;
    }

    public void setAuthorSurname(String authorSurname) {
        this.authorSurname = authorSurname;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookSupplyDto that = (BookSupplyDto) o;
        return Objects.equals(id, that.id) && Objects.equals(bookName, that.bookName) && Objects.equals(authorName, that.authorName) && Objects.equals(authorSurname, that.authorSurname) && Objects.equals(publisher, that.publisher) && Objects.equals(isbn, that.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, authorName, authorSurname, publisher, isbn);
    }
}
