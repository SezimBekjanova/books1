package kg.megacom.studentrating.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ReaderDTO {
    Long id;
    String name;
    String surname;
    String patronymic;
    Date dateOfBirth;
    String address;
    String cardNum;
}
