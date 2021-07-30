package com.coop.bankapptest.account;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.UUID;

public interface BalanceRepository extends JpaRepository<BalanceEntity, UUID>, JpaSpecificationExecutor<BalanceEntity> {
}
