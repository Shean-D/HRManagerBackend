package edu.icet.hrm_backend.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
public class EmployeeDTO {
    private Long id;

    @NotBlank(message = "Name is required")
    @Size(max = 100, message = "Name must be less than 100 characters")
    private String name;

    @Email(message = "Invalid Format")
    @NotBlank(message = "Email is required")
    private String email;

    @NotBlank(message = "Department is required")
    @Pattern(regexp = "^(HR|IT|Finance|Operations)$", message = "Department must be one of HR, IT, Finance, Operations")
    private String departement;

    private LocalDateTime createAt;

    private LocalDateTime updatedAt;
}
