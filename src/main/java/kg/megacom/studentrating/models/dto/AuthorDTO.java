package kg.megacom.studentrating.models.dto;

import kg.megacom.studentrating.models.Book;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AuthorDTO {
    Long id;
    String name;
}
