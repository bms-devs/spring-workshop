package pl.com.bms.springworkshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.com.bms.springworkshop.model.Transfer;
import pl.com.bms.springworkshop.service.BankService;

@RestController
@RequestMapping("bank")
public class BankController {

    private BankService bankService;

    @Autowired
    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @RequestMapping(value = "transfer", method = RequestMethod.POST)
    public boolean transfer(@RequestBody Transfer transfer) {
        return this.bankService.transfer(transfer);
    }

}
