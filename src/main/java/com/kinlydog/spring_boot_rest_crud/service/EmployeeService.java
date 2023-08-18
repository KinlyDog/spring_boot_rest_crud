package com.kinlydog.spring_boot_rest_crud.service;

import com.kinlydog.spring_boot_rest_crud.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
