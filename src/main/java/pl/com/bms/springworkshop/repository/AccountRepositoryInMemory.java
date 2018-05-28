package pl.com.bms.springworkshop.repository;

import org.springframework.stereotype.Repository;
import pl.com.bms.springworkshop.model.Account;

import java.util.HashMap;
import java.util.Map;

@Repository
public class AccountRepositoryInMemory implements AccountRepository {

    private Map<Long, Account> accounts;
    private static long nextId = 0L;

    public AccountRepositoryInMemory() {
        this.accounts = new HashMap<>();
    }

    @Override
    public Account save(Account account) {
        if (account.getNumber() == null) {
            long number = nextId++;
            account.setNumber(number);
        }
        this.accounts.put(account.getNumber(), account);
        return account;
    }

    @Override
    public Account findById(long number) {
        return this.accounts.get(number);
    }

    @Override
    public void deleteById(long number) {
        this.accounts.remove(number);
    }
}
