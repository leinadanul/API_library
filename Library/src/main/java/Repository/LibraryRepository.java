package Repository;

import Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Book, Long> {

}
