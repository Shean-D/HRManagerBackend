package edu.icet.hrm_backend.service.impl;

import edu.icet.hrm_backend.entity.EmployeeEntity;
import edu.icet.hrm_backend.model.EmployeeDTO;
import edu.icet.hrm_backend.repository.EmploiyeeRepository;
import edu.icet.hrm_backend.service.EmployeeService;
import edu.icet.hrm_backend.util.EmployeeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    final EmploiyeeRepository repository;

    public List<EmployeeDTO> getAllEmployees(){
        List<EmployeeEntity> employees = repository.findAll();
        return EmployeeMapper.toModelList(employees);
    }

    public EmployeeDTO addEmployee(EmployeeDTO employee){

        if(repository.existsByEmail(employee.getEmail())){
            throw new RuntimeException("Email already exists");
        }
        EmployeeEntity entity = EmployeeMapper.toEntity(employee);
        EmployeeEntity savedEntity = repository.save(entity);
        return EmployeeMapper.toModel(savedEntity);
    }

    public EmployeeDTO updateEmployee(Long id, EmployeeDTO updatedEmployee){

        return repository.findById(id).map(employee ->{
            employee.setName(updatedEmployee.getName());
            employee.setEmail(updatedEmployee.getEmail());
            employee.setDepartment(updatedEmployee.getDepartement());
            EmployeeEntity entity = repository.save(employee);
            return EmployeeMapper.toModel(entity);
        }).orElseThrow(() -> new RuntimeException("Employee not found"));
    }

    public void deleteEmployee(Long id){
        repository.deleteById(id);
    }

}
