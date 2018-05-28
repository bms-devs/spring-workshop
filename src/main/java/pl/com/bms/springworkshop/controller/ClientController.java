package pl.com.bms.springworkshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.com.bms.springworkshop.model.Client;
import pl.com.bms.springworkshop.service.ClientService;

@RestController("client")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Long create(@RequestBody Client client) {
        return this.clientService.create(client);
    }

    @RequestMapping(value = ":id")
    public Client read(@PathVariable long id) {
        return this.clientService.read(id);
    }
}
