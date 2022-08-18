package kg.megacom.studentrating.mappers;

import kg.megacom.studentrating.models.Author;
import kg.megacom.studentrating.models.dto.AuthorDTO;

import java.util.List;

public interface AuthorMapper {
    Author fromDto(AuthorDTO authorDTO);
    AuthorDTO toDto(Author author);
    List<Author> fromDto(List<AuthorDTO> authorDTOS);
    List<AuthorDTO> toDto(List<Author> authors);
}
