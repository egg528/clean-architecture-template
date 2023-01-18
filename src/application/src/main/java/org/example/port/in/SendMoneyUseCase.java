package org.example.port.in;

import org.example.port.in.request.SendMoneyCommand;

public interface SendMoneyUseCase {

    boolean sendMoney(SendMoneyCommand command);
}
