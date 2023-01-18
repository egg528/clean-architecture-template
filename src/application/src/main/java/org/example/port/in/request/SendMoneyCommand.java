package org.example.port.in.request;

import com.example.entity.Account.AccountId;
import com.example.entity.Money;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import org.example.common.SelfValidating;

@Getter
public class SendMoneyCommand extends SelfValidating<SendMoneyCommand> {

    @NotNull private final AccountId sourceAccountId;

    @NotNull private final AccountId targetAccountId;

    @NotNull private final Money money;

    public SendMoneyCommand(AccountId sourceAccountId, AccountId targetAccountId, Money money) {
        this.sourceAccountId = sourceAccountId;
        this.targetAccountId = targetAccountId;
        this.money = money;
        this.validateSelf();
    }
}
