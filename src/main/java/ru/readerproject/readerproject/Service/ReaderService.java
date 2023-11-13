package ru.readerproject.readerproject.Service;

import ru.readerproject.readerproject.Model.Book;
import ru.readerproject.readerproject.Request.BookRequest;

import java.util.List;
import java.util.Optional;

public interface ReaderService {

    Book createBook(BookRequest bookRequest);
    Book putHome(Book book);
    List<Book> getBook();
    Optional<Book> getBookId(Long id);
    void deleteHome(Long id);

}
