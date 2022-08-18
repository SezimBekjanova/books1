package kg.megacom.studentrating.mappers;

import kg.megacom.studentrating.models.Operation;
import kg.megacom.studentrating.models.dto.OperationDTO;

import java.util.List;

public interface OperationMapper {
    Operation fromDto(OperationDTO operationDTO);
    OperationDTO toDto(Operation operation);
    List<Operation> fromDto(List<OperationDTO> operationDTOS );
    List<OperationDTO> toDto(List <Operation> operations );

}
