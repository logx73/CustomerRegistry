package com.registry.application.Repository;

import com.registry.application.Entity.ContractType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface ContractTypeRepository extends JpaRepository<ContractType,Long> {
}
