package com.registry.application.Dao;

import com.registry.application.Entity.Customer;
import com.registry.application.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAO {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomer() {
        return customerRepository.findAll();
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).get();
    }

    public Customer updateCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public String deleteCustomer(Long id) {
        customerRepository.deleteById(id);
        return id+" deleted";
    }
}
