package kg.megacom.studentrating.mappers.impl;

import kg.megacom.studentrating.mappers.ReaderMapper;
import kg.megacom.studentrating.models.Reader;
import kg.megacom.studentrating.models.dto.ReaderDTO;

import java.util.ArrayList;
import java.util.List;

public class ReaderMapperImpl implements ReaderMapper {
    @Override
    public Reader fromDto(ReaderDTO readerDTO) {
        Reader reader = new Reader();
        reader.setAddress(readerDTO.getAddress());
        reader.setName(readerDTO.getName());
        reader.setId(readerDTO.getId());
        reader.setPatronymic(readerDTO.getPatronymic());
        reader.setCardNum(readerDTO.getCardNum());
        reader.setDateOfBirth(readerDTO.getDateOfBirth());
        reader.setSurname(readerDTO.getSurname());
        return reader;
    }

    @Override
    public ReaderDTO toDto(Reader reader) {
        ReaderDTO readerDTO = new ReaderDTO();
        readerDTO.setAddress(reader.getAddress());
        readerDTO.setName(reader.getName());
        readerDTO.setPatronymic(reader.getPatronymic());
        readerDTO.setSurname(reader.getSurname());
        readerDTO.setDateOfBirth(reader.getDateOfBirth());
        readerDTO.setId(reader.getId());
        readerDTO.setDateOfBirth(reader.getDateOfBirth());
        return readerDTO;
    }

    @Override
    public List<Reader> fromDto(List<ReaderDTO> readerDTOS) {
        List<Reader> readers = new ArrayList<>();
        for(ReaderDTO item : readerDTOS){
            Reader reader = fromDto(item);
            readers.add(reader);
        }
        return readers;
    }

    @Override
    public List<ReaderDTO> toDto(List<Reader> readers) {
        List<ReaderDTO> readerDTOS = new ArrayList<>();
        for(Reader item : readers){
            ReaderDTO readerDTO = toDto(item);
            readerDTOS.add(readerDTO);
        }
        return readerDTOS;
    }
}
