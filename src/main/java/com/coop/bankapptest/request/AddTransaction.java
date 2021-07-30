package com.coop.bankapptest.request;

import lombok.Data;
import lombok.Value;

@Data
@Value
public class AddTransaction {
  String action;
  Double value;
}
