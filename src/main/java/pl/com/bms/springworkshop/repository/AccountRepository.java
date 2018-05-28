package pl.com.bms.springworkshop.repository;

import pl.com.bms.springworkshop.model.Account;

public interface AccountRepository {
    Account save(Account account);
    Account findById(long number);
    void deleteById(long number);
}
