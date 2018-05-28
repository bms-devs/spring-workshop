package pl.com.bms.springworkshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.bms.springworkshop.model.Account;
import pl.com.bms.springworkshop.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController {

    private AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Long create(@RequestBody Account account) {
        return this.accountService.create(account);
    }

    @RequestMapping(value = "{number}")
    public Account read(@PathVariable long number) {
        return this.accountService.read(number);
    }

    @RequestMapping(value = "{number}", method = RequestMethod.PUT)
    public boolean update(@PathVariable long number, @RequestBody Account account) {
        return this.accountService.update(number, account);
    }

    @RequestMapping(value = "{number}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable long number) {
        return this.accountService.delete(number);
    }
}
