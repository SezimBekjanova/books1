package kg.megacom.studentrating.mappers.impl;

import kg.megacom.studentrating.mappers.AuthorMapper;
import kg.megacom.studentrating.models.Author;
import kg.megacom.studentrating.models.dto.AuthorDTO;

import java.util.ArrayList;
import java.util.List;

public class AuthorMapperImpl implements AuthorMapper {
    @Override
    public Author fromDto(AuthorDTO authorDTO) {
        Author author = new Author();
        author.setId(authorDTO.getId());
        author.setName(authorDTO.getName());
        return author;
    }

    @Override
    public AuthorDTO toDto(Author author) {
        AuthorDTO authorDTO = new AuthorDTO();
        authorDTO.setId(author.getId());
        authorDTO.setName(author.getName());
        return authorDTO;
    }

    @Override
    public List<Author> fromDto(List<AuthorDTO> authorDTOS) {
        List<Author> authors = new ArrayList<>();
        for(AuthorDTO item : authorDTOS){
            Author author = fromDto(item);
            authors.add(author);
        }
        return authors;
    }

    @Override
    public List<AuthorDTO> toDto(List<Author> authors) {
        List<AuthorDTO> authorDTOS = new ArrayList<>();
        for(Author item: authors){
            AuthorDTO authorDTO = toDto(item);
            authorDTOS.add(authorDTO);
        }
        return authorDTOS;
    }
}
