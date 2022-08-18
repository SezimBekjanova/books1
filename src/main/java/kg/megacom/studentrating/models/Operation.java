package kg.megacom.studentrating.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "operations")
public class Operation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date startDate;
    Date endDAte;
    @ManyToOne
        @JoinColumn(name="reader_id")
    Reader reader;
    @ManyToOne
        @JoinColumn(name = "book_id")
    Book book;
    @Enumerated(value = EnumType.STRING)
    OperationStatus status;
}
