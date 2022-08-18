package kg.megacom.studentrating.mappers.impl;

import kg.megacom.studentrating.mappers.BookMapper;
import kg.megacom.studentrating.mappers.OperationMapper;
import kg.megacom.studentrating.mappers.ReaderMapper;
import kg.megacom.studentrating.models.Operation;
import kg.megacom.studentrating.models.dto.OperationDTO;

import java.util.ArrayList;
import java.util.List;

public class OperationMapperImpl implements OperationMapper {
    BookMapper bookMapper;
    ReaderMapper readerMapper;
    @Override
    public Operation fromDto(OperationDTO operationDTO) {
        Operation operation = new Operation();
        operation.setId(operationDTO.getId());
        operation.setReader(readerMapper.fromDto(operationDTO.getReader()));
        operation.setBook(bookMapper.fromDto(operationDTO.getBook()));
        operation.setStatus(operationDTO.getStatus());
        operation.setEndDAte(operationDTO.getEndDAte());
        operation.setStartDate(operationDTO.getStartDate());
        return operation;
    }

    @Override
    public OperationDTO toDto(Operation operation) {
        OperationDTO operationDTO = new OperationDTO();
        operationDTO.setStartDate(operation.getStartDate());
        operationDTO.setEndDAte(operation.getEndDAte());
        operationDTO.setId(operation.getId());
        operationDTO.setStatus(operation.getStatus());
        operationDTO.setBook(bookMapper.toDto(operation.getBook()));
        operationDTO.setReader(readerMapper.toDto(operation.getReader()));
        return operationDTO;
    }

    @Override
    public List<Operation> fromDto(List<OperationDTO> operationDTOS) {
        List<Operation> operations = new ArrayList<>();
        for(OperationDTO item : operationDTOS){
            Operation operation = fromDto(item);
            operations.add(operation);
        }
        return operations;
    }

    @Override
    public List<OperationDTO> toDto(List<Operation> operations) {
        List<OperationDTO> operationDTOS = new ArrayList<>();
        for(Operation item : operations){
            OperationDTO operationDTO = toDto(item);
            operationDTOS.add(operationDTO);
        }
        return operationDTOS;
    }
}
