package com.javedrpi.servicelocatorfactorypattern.way2.controller;

import com.javedrpi.servicelocatorfactorypattern.way2.model.Customer;
import com.javedrpi.servicelocatorfactorypattern.way2.model.Employee;
import com.javedrpi.servicelocatorfactorypattern.way2.service.IDbRepositoryFactory;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

/**
 * @author Javed Ameen Shaikh
 * @website <a href="https://www.javedrpi.com/me">Portfolio</a>
 */

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = "/db")
public class DbController {
    private final IDbRepositoryFactory dbRepositoryFactory;
    @GetMapping("/insertT1")
    public Employee insertT1(){
        Employee employee = new Employee("emp_1", "TCS");
        dbRepositoryFactory.getDbRepository(employee.getClass().getSimpleName()).insert(employee);
        return employee;
    }

    @GetMapping("/insertEmployees")
    public List<Employee> insertEmployees(){
        List<Employee> employees = List.of(new Employee("emp_1", "TCS"),
                new Employee("emp_2", "Infosys"));
        dbRepositoryFactory.getDbRepository(employees.get(0).getClass().getSimpleName())
                .insertAll(Collections.singletonList(employees));
        return employees;
    }

    @GetMapping("/insertT2")
    public Customer insertT2(){
        Customer customer = new Customer( "cus_101", "John", "33");
        dbRepositoryFactory.getDbRepository(customer.getClass().getSimpleName()).insert(customer);
        return customer;
    }
}
