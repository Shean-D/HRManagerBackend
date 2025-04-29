package edu.icet.hrm_backend.controller;

import edu.icet.hrm_backend.model.EmployeeDTO;
import edu.icet.hrm_backend.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping
    public EmployeeDTO addEmployee(@RequestBody EmployeeDTO employee){
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO employee){
        return employeeService.updateEmployee(id, employee);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity removeEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.noContent().build();
    }

}
