package com.registry.application.Controller;

import com.registry.application.Entity.Customer;
import com.registry.application.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping(value = "/getAllCustomer")
    public ResponseEntity<List<Customer>> getCustomer(){
        return ResponseEntity.ok(customerService.getAllCustomer());
    }

    @GetMapping(value = "/getCustomer/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Long id){
        return ResponseEntity.ok(customerService.getCustomer(id));
    }

    @PostMapping(value = "/saveCustomer")
    public ResponseEntity<Customer> saveCustomer(@RequestBody @Valid Customer customer){
        return ResponseEntity.ok(customerService.saveCustomer(customer));
    }

    @PutMapping(value = "/updateCustomer/{id}")
    public ResponseEntity<Customer> updateCustomer(@RequestBody @Valid Customer customer, @PathVariable Long id){
        return ResponseEntity.ok(customerService.updateCustomer(customer,id));
    }

    @DeleteMapping(value = "/deleteCustomer/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Long id){
        return ResponseEntity.ok(customerService.deleteCustomer(id));
    }
}
