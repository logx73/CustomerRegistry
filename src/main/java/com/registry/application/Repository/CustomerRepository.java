package com.registry.application.Repository;

import com.registry.application.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
    @Override
    List<Customer> findAll();
    Optional<Customer> findById(Long id);
}
