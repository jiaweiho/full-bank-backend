package com.coop.bankapptest.banktransaction;

import com.coop.bankapptest.domain.event.BankTransactionSavedEvent;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.AbstractAggregateRoot;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "bank_transaction")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankTransactionEntity extends AbstractAggregateRoot<BankTransactionEntity> {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID uuid;
  private String action;
  private Double value;
  private LocalDateTime lastModifiedDate;

  public BankTransactionEntity(String action, Double value, LocalDateTime lastModifiedDate) {
    this.action = action;
    this.value = value;
    this.lastModifiedDate = lastModifiedDate;
  }

  public BankTransactionEntity afterBankTransactionSaveCompleted() {
    registerEvent(new BankTransactionSavedEvent(uuid, action, value, lastModifiedDate));
    return this;
  }
}
