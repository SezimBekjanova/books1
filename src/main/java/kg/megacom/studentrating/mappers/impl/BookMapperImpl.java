package kg.megacom.studentrating.mappers.impl;

import kg.megacom.studentrating.mappers.AuthorMapper;
import kg.megacom.studentrating.mappers.BookMapper;
import kg.megacom.studentrating.models.Author;
import kg.megacom.studentrating.models.Book;
import kg.megacom.studentrating.models.dto.AuthorDTO;
import kg.megacom.studentrating.models.dto.BookDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class BookMapperImpl implements BookMapper {
    AuthorMapper authorMapper;
    @Override
    public BookDTO toDto(Book book) {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setId(book.getId());
        bookDTO.setName(book.getName());
        bookDTO.setPrice(book.getPrice());
        bookDTO.setAuthors((List<AuthorDTO>) authorMapper.toDto((Author) book.getAuthors()));
        return bookDTO;
    }

    @Override
    public Book fromDto(BookDTO bookDTO) {
        Book book = new Book();
        book.setId(bookDTO.getId());
        book.setName(bookDTO.getName());
        book.setPrice(bookDTO.getPrice());
        book.setAuthors((Set<Author>) authorMapper.fromDto(bookDTO.getAuthors()));
        return book;
    }

    @Override
    public List<BookDTO> toDto(List<Book> books) {
        List<BookDTO> bookDTOS = new ArrayList<>();
        for(Book item : books){
            BookDTO bookDTO= toDto(item);
            bookDTOS.add(bookDTO);
        }
        return bookDTOS;
    }

    @Override
    public List<Book> fromDto(List<BookDTO> bookDTOS) {
        List<Book> books = new ArrayList<>();
        for(BookDTO item : bookDTOS){
            Book book = fromDto(item);
            books.add(book);
        }

        return books;
    }
}
