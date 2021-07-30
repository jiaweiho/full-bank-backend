package com.coop.bankapptest.domain;

import com.coop.bankapptest.banktransaction.BankTransactionEntity;

public class BankTransactionMapper {

  public static BankTransactionDto mapToDto(BankTransactionEntity entity) {
    return BankTransactionDto.builder()
            .action(entity.getAction())
            .value(entity.getValue())
            .build();
  }
}
