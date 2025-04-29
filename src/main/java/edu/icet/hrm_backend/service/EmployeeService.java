package edu.icet.hrm_backend.service;


import edu.icet.hrm_backend.model.EmployeeDTO;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDTO> getAllEmployees();

    EmployeeDTO addEmployee(EmployeeDTO employee);

    EmployeeDTO updateEmployee(Long id, EmployeeDTO updatedEmployee);

    void deleteEmployee(Long id);

}
