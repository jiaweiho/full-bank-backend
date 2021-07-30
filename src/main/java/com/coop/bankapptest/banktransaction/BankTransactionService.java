package com.coop.bankapptest.banktransaction;

import com.coop.bankapptest.domain.BankTransactionDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;

import static com.coop.bankapptest.domain.BankTransactionMapper.mapToDto;

@Service
@AllArgsConstructor
public class BankTransactionService {

  private final BankTransactionRepository bankTransactionRepository;

  @Transactional
  public BankTransactionDto addTransaction(String action, Double value, LocalDateTime lastModifiedDate) {
    BankTransactionEntity bankTransactionEntity = new BankTransactionEntity(action, value, lastModifiedDate);
    bankTransactionRepository.save(bankTransactionEntity.afterBankTransactionSaveCompleted());
    return mapToDto(bankTransactionEntity);
  }
}
