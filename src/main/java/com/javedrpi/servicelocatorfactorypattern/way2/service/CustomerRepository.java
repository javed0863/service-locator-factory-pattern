package com.javedrpi.servicelocatorfactorypattern.way2.service;

import com.javedrpi.servicelocatorfactorypattern.way2.model.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Javed Ameen Shaikh
 * @website <a href="https://www.javedrpi.com/me">Portfolio</a>
 */

@Repository("Customer")
@Slf4j
public class CustomerRepository implements IInsertRecord<Customer> {
    @Override
    public void insert(Customer customer) {
        System.out.println("Inserting 1 Employee record 🐆 !");
    }

    @Override
    public void insertAll(List<Customer> list) {
        System.out.println("Inserting list of Employee records 🐅🐅 !!");
    }
}
