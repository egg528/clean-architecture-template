package org.example.port.in;

import com.example.entity.Account.AccountId;
import com.example.entity.Money;

public interface GetAccountBalanceQuery {

    Money getAccountBalance(AccountId accountId);
}
