package Service;


import Entity.Book;
import Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    private LibraryRepository libraryRepository;
    @Autowired

    public LibraryService(LibraryRepository libraryRepository) {
        this.libraryRepository = libraryRepository;}

    public Book saveBook(Book book){
        return libraryRepository.save(book);
    }
}
