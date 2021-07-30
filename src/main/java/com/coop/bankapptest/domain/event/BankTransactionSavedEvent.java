package com.coop.bankapptest.domain.event;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
public class BankTransactionSavedEvent {
  private final UUID uuid;
  private final String action;
  private final Double value;
  private final LocalDateTime lastModifiedDate;
}
