package com.registry.application.Service;

import com.registry.application.Dao.CustomerDAO;
import com.registry.application.Entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerDAO customerDAO;

    public List<Customer> getAllCustomer() {
        return customerDAO.getAllCustomer();
    }

    public Customer saveCustomer(Customer customer) {
        return customerDAO.saveCustomer(customer);
    }

    public Customer updateCustomer(Customer customer, Long id) {
        Customer customer1 = getCustomer(id);
        customer.setId(customer1.getId());
        customer.getDetails().setId(customer1.getDetails().getId());
        return customerDAO.updateCustomer(customer);
    }

    public Customer getCustomer(Long id) {
        return customerDAO.getCustomer(id);
    }

    public String deleteCustomer(Long id) {
        customerDAO.deleteCustomer(id);
        return id+" deleted";
    }
}
