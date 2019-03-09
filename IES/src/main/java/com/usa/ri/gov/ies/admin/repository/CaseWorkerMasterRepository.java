package com.usa.ri.gov.ies.admin.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usa.ri.gov.ies.admin.entity.CaseWorkerMasterEntity;

public interface CaseWorkerMasterRepository extends JpaRepository<CaseWorkerMasterEntity,Serializable>{
     
}
