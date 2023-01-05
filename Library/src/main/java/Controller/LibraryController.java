package Controller;

import Entity.Book;
import Exceptions.ResourceNotFound;
import Service.LibraryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class LibraryController {

    public LibraryService libraryService;

    @PostMapping("/create")
    public ResponseEntity<Book> create(@RequestBody Book newBook) throws ResourceNotFound {
        Book book = libraryService.saveBook(newBook);
        if (book == null) {
            throw new ResourceNotFound("This book already been saved");
        } else {
            return new ResponseEntity<>(book, HttpStatus.CREATED);
        }


    }
}
