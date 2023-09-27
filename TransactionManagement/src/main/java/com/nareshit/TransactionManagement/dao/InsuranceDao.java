package com.nareshit.TransactionManagement.dao;

import com.nareshit.TransactionManagement.model.Insurance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InsuranceDao extends JpaRepository<Insurance,Integer> {
}
