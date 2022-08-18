package kg.megacom.studentrating.mappers;

import kg.megacom.studentrating.models.Book;
import kg.megacom.studentrating.models.dto.BookDTO;

import java.util.List;

public interface BookMapper {
    BookDTO toDto(Book book);
    Book fromDto(BookDTO bookDTO);
    List<BookDTO> toDto(List<Book> books);
    List<Book> fromDto(List<BookDTO> bookDTOS);
}
