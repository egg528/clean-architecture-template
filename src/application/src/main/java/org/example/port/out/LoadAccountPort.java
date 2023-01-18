package org.example.port.out;

import com.example.entity.Account;
import com.example.entity.Account.AccountId;
import java.time.LocalDateTime;

public interface LoadAccountPort {

    Account loadAccount(AccountId accountId, LocalDateTime baselineDate);
}
