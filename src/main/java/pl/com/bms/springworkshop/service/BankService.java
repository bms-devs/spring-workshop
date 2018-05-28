package pl.com.bms.springworkshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.bms.springworkshop.model.Account;
import pl.com.bms.springworkshop.model.Transfer;

@Service
public class BankService {

    private AccountService accountService;

    @Autowired
    public BankService(AccountService accountService) {
        this.accountService = accountService;
    }

    public boolean transfer(Transfer transfer) {
        Account accountFrom = accountService.read(transfer.getAccountNumberFrom());
        Account accountTo = accountService.read(transfer.getAccountNumberTo());
        accountFrom.setBalance(accountFrom.getBalance() - transfer.getAmount());
        accountTo.setBalance(accountTo.getBalance() + transfer.getAmount());
        accountService.update(accountFrom.getNumber(), accountFrom);
        accountService.update(accountTo.getNumber(), accountTo);
        return true;
    }

}
