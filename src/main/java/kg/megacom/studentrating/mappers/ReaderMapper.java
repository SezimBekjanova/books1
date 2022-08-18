package kg.megacom.studentrating.mappers;

import kg.megacom.studentrating.models.Reader;
import kg.megacom.studentrating.models.dto.ReaderDTO;

import java.util.List;

public interface ReaderMapper {
    Reader fromDto(ReaderDTO readerDTO);
    ReaderDTO toDto(Reader reader);
    List<Reader> fromDto(List<ReaderDTO> readerDTOS);
    List<ReaderDTO> toDto(List<Reader> readers);
}
