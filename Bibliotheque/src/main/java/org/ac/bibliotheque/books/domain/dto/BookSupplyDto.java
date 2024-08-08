package org.ac.bibliotheque.books.domain.dto;

import java.util.Objects;

public class BookSupplyDto {

    private Long id;
    private String title;
    private String authorName;
    private String authorSurname;
    private String publisher;
    private String isbn;
    private Long year;
    private Long libraryId;
    private Long quantity;
    private Long available;

    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(authorName, that.authorName) && Objects.equals(authorSurname, that.authorSurname) && Objects.equals(publisher, that.publisher) && Objects.equals(isbn, that.isbn) && Objects.equals(year, that.year) && Objects.equals(libraryId, that.libraryId) && Objects.equals(quantity, that.quantity) && Objects.equals(available, that.available);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, authorName, authorSurname, publisher, isbn, year, libraryId, quantity, available);
    }

    @Override
    public String toString() {
        return String.format("Book DTO: id - %d, Book Name - %s, Author: - %s %s",
                id, title, authorName, authorName );
    }
}
