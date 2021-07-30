package com.coop.bankapptest.account;

import com.coop.bankapptest.domain.BalanceDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class BalanceService {

  private final BalanceRepository balanceRepository;

  public List<BalanceDto> getBalanceAccounts(UUID aggregateId) {
    return null;
  }
}
