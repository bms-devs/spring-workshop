package pl.com.bms.springworkshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.com.bms.springworkshop.model.Account;
import pl.com.bms.springworkshop.repository.AccountRepository;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    @Autowired
    public AccountService(@Qualifier("accountRepositoryDatabase") AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public long create(Account account) {
        return accountRepository.save(account).getNumber();
    }

    public Account read(long number) {
        return this.accountRepository.findById(number);
    }

    public boolean update(long number, Account account) {
        account.setNumber(number);
        return this.accountRepository.save(account) != null;
    }

    public boolean delete(long number) {
        this.accountRepository.deleteById(number);
        return true;
    }

}
