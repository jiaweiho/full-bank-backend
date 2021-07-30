package com.coop.bankapptest.banktransaction;

import com.coop.bankapptest.domain.BankTransactionDto;
import com.coop.bankapptest.request.AddTransaction;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

import static com.coop.bankapptest.BankAppTestApplication.API_VERSION_1;

@RestController
@RequestMapping(API_VERSION_1 + "/transactions")
@AllArgsConstructor
public class BankTransactionController {

  private final BankTransactionService bankTransactionService;

  @PostMapping
  public BankTransactionDto addTransaction(@RequestBody AddTransaction transaction) {
    return bankTransactionService.addTransaction(transaction.getAction(), transaction.getValue(), LocalDateTime.now());
  }
}
