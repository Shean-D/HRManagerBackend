package edu.icet.hrm_backend.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Long id;
    private String name;
    private String email;
    private String departement;

}
