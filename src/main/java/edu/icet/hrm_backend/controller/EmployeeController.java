package edu.icet.hrm_backend.controller;

import edu.icet.hrm_backend.model.EmployeeDTO;
import edu.icet.hrm_backend.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
@RequiredArgsConstructor
public class EmployeeController {

    final EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDTO> allEmployess(){
        return employeeService.getAllEmployees();
    }


}
