package org.example.service;

import com.example.entity.Account.AccountId;
import com.example.entity.Money;
import java.time.LocalDateTime;
import lombok.RequiredArgsConstructor;
import org.example.port.in.GetAccountBalanceQuery;
import org.example.port.out.LoadAccountPort;

@RequiredArgsConstructor
class GetAccountBalanceService implements GetAccountBalanceQuery {

    private final LoadAccountPort loadAccountPort;

    @Override
    public Money getAccountBalance(AccountId accountId) {
        return loadAccountPort.loadAccount(accountId, LocalDateTime.now()).calculateBalance();
    }
}
