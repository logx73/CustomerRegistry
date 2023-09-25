package com.registry.application.Controller;

import com.registry.application.Entity.ContractType;
import com.registry.application.Entity.Customer;
import com.registry.application.Service.ContractTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContractTypeController {

    @Autowired
    private ContractTypeService contractTypeService;

    @GetMapping(value = "/getAllContract")
    public ResponseEntity<List<ContractType>> getContract(){
        return ResponseEntity.ok(contractTypeService.getAllContract());
    }

    @GetMapping(value = "/getContract/{id}")
    public ResponseEntity<ContractType> getContractById(@PathVariable Long id) {
        return ResponseEntity.ok(contractTypeService.getContractById(id));
    }

    @PostMapping(value = "/saveContract")
    public ResponseEntity<ContractType> saveContract(@RequestBody ContractType contractType ){
        return ResponseEntity.ok(contractTypeService.saveContract(contractType));
    }

    @PutMapping(value = "/updateContract/{id}")
    public ResponseEntity<ContractType> updateContractType(@RequestBody ContractType contractType,@PathVariable Long id){
        return ResponseEntity.ok(contractTypeService.updateContract(contractType,id));
    }

    @DeleteMapping(value = "/deleteContract/{id}")
    public ResponseEntity<String> deleteContractType(@PathVariable Long id){
        return ResponseEntity.ok(contractTypeService.deleteContract(id));
    }

}
