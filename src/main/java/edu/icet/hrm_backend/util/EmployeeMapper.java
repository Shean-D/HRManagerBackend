package edu.icet.hrm_backend.util;

import edu.icet.hrm_backend.entity.EmployeeEntity;
import edu.icet.hrm_backend.model.EmployeeDTO;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMapper {

    public static EmployeeDTO toModel(EmployeeEntity entity){
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setEmail(entity.getEmail());
        dto.setDepartement(entity.getDepartment());
        dto.setCreateAt(entity.getCreateAt());
        dto.setUpdatedAt(entity.getUpdatedAt());

        return dto;
    }

    public static EmployeeEntity toEntity(EmployeeDTO dto){
        EmployeeEntity entity = new EmployeeEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setEmail(dto.getEmail());
        entity.setDepartment(dto.getDepartement());
        entity.setCreateAt(dto.getCreateAt());
        entity.setUpdatedAt(dto.getUpdatedAt());
        return entity;
    }

    public static List<EmployeeDTO> toModelList(List<EmployeeEntity> entityList){
        return entityList.stream().map(EmployeeMapper::toModel).collect(Collectors.toList());
    }
}
