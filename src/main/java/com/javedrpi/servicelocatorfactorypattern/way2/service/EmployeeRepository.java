package com.javedrpi.servicelocatorfactorypattern.way2.service;

import com.javedrpi.servicelocatorfactorypattern.way2.model.Employee;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Javed Ameen Shaikh
 * @website <a href="https://www.javedrpi.com/me">Portfolio</a>
 */

@Repository("Employee")
@Slf4j
public class EmployeeRepository implements IInsertRecord<Employee> {
    @Override
    public void insert(Employee employee) {
        System.out.println("Inserting 1 Employee record 🦧 !");
    }

    @Override
    public void insertAll(List<Employee> list) {
        System.out.println("Inserting list of Employee records 🦧🦧 !!");
    }
}
