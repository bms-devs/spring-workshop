package pl.com.bms.springworkshop.repository;

import org.springframework.data.repository.CrudRepository;
import pl.com.bms.springworkshop.model.Account;


public interface AccountRepositoryDatabase extends CrudRepository<Account, Long>, AccountRepository {
}
