package org.closure.systemcompany.Mapper;

import org.closure.systemcompany.DTO.EmployeeDTO;
import org.closure.systemcompany.entities.EmployeeEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

    EmployeeMapper INSTANCE =  Mappers.getMapper(EmployeeMapper.class);

    
    @Mapping(source = "", target = "")
    @org.springframework.beans.factory.annotation.Autowired(required=true)
    
    EmployeeDTO convertToDTo (EmployeeEntity entity );
    EmployeeEntity convertToEntity (EmployeeDTO dto );
    
}
