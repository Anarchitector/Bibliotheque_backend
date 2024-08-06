package org.ac.bibliotheque.books.domain.dto;

import java.util.Objects;

public class BookDto {

    private Long id;
    private String bookName;
    private String authorName;
    private String authorSurname;
    private Long year;
    private Long isbn;
    private String publisher;
    private Long libraryId;
    private Long quantity;
    private Long available;

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Long getLibraryId() {
        return libraryId;
    }

    public void setLibraryId(Long libraryId) {
        this.libraryId = libraryId;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getAvailable() {
        return available;
    }

    public void setAvailable(Long available) {
        this.available = available;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookDto bookDto = (BookDto) o;
        return Objects.equals(id, bookDto.id) && Objects.equals(bookName, bookDto.bookName) && Objects.equals(authorName, bookDto.authorName) && Objects.equals(authorSurname, bookDto.authorSurname) && Objects.equals(year, bookDto.year) && Objects.equals(isbn, bookDto.isbn) && Objects.equals(publisher, bookDto.publisher) && Objects.equals(libraryId, bookDto.libraryId) && Objects.equals(quantity, bookDto.quantity) && Objects.equals(available, bookDto.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bookName, authorName, authorSurname, year, isbn, publisher, libraryId, quantity, available);
    }

    @Override
    public String toString() {
        return String.format("Book DTO: id - %d, Book Name - %s, Author: - %s %s",
                id, bookName, authorName, authorName );
    }
}
