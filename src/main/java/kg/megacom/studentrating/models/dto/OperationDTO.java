package kg.megacom.studentrating.models.dto;

import kg.megacom.studentrating.models.OperationStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OperationDTO {
    Long id;
    Date startDate;
    Date endDAte;
    ReaderDTO reader;
    BookDTO book;
    OperationStatus status;
}
