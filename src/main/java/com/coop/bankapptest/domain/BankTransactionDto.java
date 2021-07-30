package com.coop.bankapptest.domain;


import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class BankTransactionDto {
  String action;
  Double value;
}
