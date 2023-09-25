package com.registry.application.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class BusinessRequirement {
    private String businessRequirment;

    public BusinessRequirement() {
    }

    public BusinessRequirement(String businessRequirment) {
        this.businessRequirment = businessRequirment;
    }

    public String getBusinessRequirment() {
        return businessRequirment;
    }

    public void setBusinessRequirment(String businessRequirment) {
        this.businessRequirment = businessRequirment;
    }
}
