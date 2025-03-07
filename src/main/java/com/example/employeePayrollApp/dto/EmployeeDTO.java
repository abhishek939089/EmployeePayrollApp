package com.example.employeePayrollApp.dto;

import lombok.*;


public @Data class EmployeeDTO {
    private String department;
    private String name;
    private double salary;

    public EmployeeDTO(String department, String name, double salary){
        this.department = department;
        this.name = name;
        this.salary = salary;
    }
}