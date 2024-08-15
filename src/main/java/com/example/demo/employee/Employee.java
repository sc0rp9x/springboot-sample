package com.example.demo.employee;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {
    private String id;
    private String firstName;
    private String lastName;
}