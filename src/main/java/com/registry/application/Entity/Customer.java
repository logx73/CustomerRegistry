package com.registry.application.Entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "details_id")
    private Detail details;

    private String accountType;

    @ElementCollection
    @CollectionTable(name = "business_requirments", joinColumns = @JoinColumn(name = "customer_id"))
    private List<BusinessRequirement> businessRequirments;

    @OneToOne
    @JoinColumn(name = "contract_id")
    private ContractType contractType;

    public Customer() {
    }

    public Customer(Long id, String name, Detail details, String accountType, List<BusinessRequirement> businessRequirments, ContractType contractType) {
        this.id = id;
        this.name = name;
        this.details = details;
        this.accountType = accountType;
        this.businessRequirments = businessRequirments;
        this.contractType = contractType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Detail getDetails() {
        return details;
    }

    public void setDetails(Detail details) {
        this.details = details;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public List<BusinessRequirement> getBusinessRequirments() {
        return businessRequirments;
    }

    public void setBusinessRequirments(List<BusinessRequirement> businessRequirments) {
        this.businessRequirments = businessRequirments;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }
}
