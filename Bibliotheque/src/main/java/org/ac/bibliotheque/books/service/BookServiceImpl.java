package org.ac.bibliotheque.books.service;

import org.ac.bibliotheque.books.repository.BookRepository;
import org.ac.bibliotheque.books.service.mapping.BookMappingService;

public class BookServiceImpl {

    private final BookRepository repository;
    private final BookMappingService mappingService;

    public BookServiceImpl(BookRepository repository, BookMappingService mappingService) {
        this.repository = repository;
        this.mappingService = mappingService;
    }


}
