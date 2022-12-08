package com.phonepe.dao;

import com.phonepe.entity.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionLog, Integer> {

}
