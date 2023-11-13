package ru.readerproject.readerproject.Service;


import org.springframework.stereotype.Service;
import ru.readerproject.readerproject.Model.Book;
import ru.readerproject.readerproject.ReaderRepository.Repository;
import ru.readerproject.readerproject.Request.BookRequest;

import java.util.List;
import java.util.Optional;

@Service
public class ReaderServiceImpl implements ReaderService {

    private final Repository repository;
    public ReaderServiceImpl(Repository repository){
        this.repository = repository;
    }

    //GetAll
    @Override
    public List<Book> getBook(){
        return repository.findAll();
    }

    //Post
    @Override
    public Book createBook(BookRequest bookRequest){
        return repository.save(Book.builder()
                .name(bookRequest.getName())
                .type(bookRequest.getType())
                .build());
    }

    //Put
    @Override
    public Book putHome(Book book){
        return repository.save(book);
    }

    //Get ID
    @Override
    public Optional<Book> getBookId(Long id){
        return repository.findById(id);
    }

    //DeleteById
    @Override
    public void deleteHome(Long id){
        repository.deleteById(id);
    }


}
