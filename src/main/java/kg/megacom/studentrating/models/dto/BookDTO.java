package kg.megacom.studentrating.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class BookDTO {
    Long id;
    String name;
    double price;
    List<AuthorDTO> authors;
}
