package com.registry.application.Service;

import com.registry.application.Dao.ContractTypeDAO;
import com.registry.application.Entity.ContractType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContractTypeService {

    @Autowired
    private ContractTypeDAO contractTypeDAO;

    public List<ContractType> getAllContract() {
        return contractTypeDAO.getAllContract();
    }

    public ContractType getContractById(Long id) {
        return contractTypeDAO.getContractById(id);
    }

    public ContractType saveContract(ContractType contractType) {
        return contractTypeDAO.saveContract(contractType);
    }

    public ContractType updateContract(ContractType contractType, Long id) {
        contractType.setId(id);
        return contractTypeDAO.saveContract(contractType);
    }

    public String deleteContract(Long id) {
        return contractTypeDAO.deleteContract(id);
    }
}
