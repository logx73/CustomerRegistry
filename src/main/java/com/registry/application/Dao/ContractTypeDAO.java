package com.registry.application.Dao;

import com.registry.application.Entity.ContractType;
import com.registry.application.Repository.ContractTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public class ContractTypeDAO {

    @Autowired
    private ContractTypeRepository contractTypeRepository;

    public List<ContractType> getAllContract() {
        return contractTypeRepository.findAll();
    }

    public ContractType getContractById(Long id) {
        return contractTypeRepository.findById(id).get();
    }

    public ContractType saveContract(ContractType contractType) {
        return contractTypeRepository.save(contractType);
    }

    public String deleteContract(Long id) {
        contractTypeRepository.deleteById(id);
        return id+" deleted";
    }
}
