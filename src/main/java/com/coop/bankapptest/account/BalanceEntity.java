package com.coop.bankapptest.account;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Table(name = "balance")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class BalanceEntity {
  @Id
  @GeneratedValue
  private UUID uuid;
  private String name;
  private Double balance;

  public BalanceEntity(String name, Double balance) {
    this.name = name;
    this.balance = balance;
  }
}
