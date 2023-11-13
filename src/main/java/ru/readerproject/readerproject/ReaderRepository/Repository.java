package ru.readerproject.readerproject.ReaderRepository;


import org.springframework.data.jpa.repository.JpaRepository;
import ru.readerproject.readerproject.Model.Book;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Book, Long> {

}
