package com.example.demo.employee;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;



@RestController
@AllArgsConstructor
public class EmployeeController {

    @GetMapping(path = "/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") final String id) {
        return new ResponseEntity(Employee.builder().id(id).firstName("Ranjit").lastName("Fernandes.").build(), HttpStatus.OK);
    }

    @PostMapping(path = "/employee")
    public ResponseEntity<Employee> createEmployee(@RequestBody final Employee employee) {
        return new ResponseEntity(employee, HttpStatus.CREATED);
    }
}