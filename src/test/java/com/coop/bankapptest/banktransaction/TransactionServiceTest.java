package com.coop.bankapptest.banktransaction;

import com.coop.bankapptest.SpringBootComponentTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class TransactionServiceTest extends SpringBootComponentTest {

  @Autowired BankTransactionRepository repository;
  @Autowired BankTransactionService service;

  private BankTransactionEntity transactionEntity0;

  @BeforeEach
  void setup() {
    transactionEntity0 = new BankTransactionEntity("insert", 200.00, LocalDateTime.now().minusDays(2));
    repository.save(transactionEntity0);
  }

  @AfterEach
  void clean() {
    repository.deleteAll();
  }

  public void testInsertBankTransaction() {
    BankTransactionEntity bankTransactionEntity = new BankTransactionEntity("insert", 200.00, LocalDateTime.now().minusDays(2));
    service.addTransaction(transactionEntity0.getAction(), transactionEntity0.getValue(), bankTransactionEntity.getLastModifiedDate());
  }
}
