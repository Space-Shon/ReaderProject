package ru.readerproject.readerproject.Contoller;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.readerproject.readerproject.Model.Book;
import ru.readerproject.readerproject.Request.BookRequest;
import ru.readerproject.readerproject.Service.ReaderService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class ReaderContoller {

    public final ReaderService readerService;

    public ReaderContoller(ReaderService readerService){
        this.readerService = readerService;
    }

    //Post
    @PostMapping("/book")
    public ResponseEntity<Book> createHome(@RequestBody @Valid BookRequest bookRequest){
        Book book = readerService.createBook(bookRequest);
        return ResponseEntity.ok(book);
    }

    //GetAll
    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBook(){
        return new ResponseEntity<>(readerService.getBook(), HttpStatus.OK);
    }

    //Put
    @PutMapping("/books/{id}")
    public ResponseEntity<Book> putBook(@RequestBody @Valid Book put){
        Book book = readerService.putHome(put);
        return ResponseEntity.ok(book);
    }

    //GetById
    @GetMapping("/books/{id}")
    public Optional<Book> getBookId(@PathVariable Long id){
        return readerService.getBookId(id);
    }

    //DeleteById
    @DeleteMapping("/books/{id}")
    public void deleteBook(@PathVariable Long id){
        readerService.deleteHome(id);
    }

}
