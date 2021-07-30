package com.coop.bankapptest.banktransaction;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BankTransactionRepository extends JpaRepository<BankTransactionEntity, UUID>, JpaSpecificationExecutor<BankTransactionEntity> {
}
