package pl.com.bms.springworkshop.service;

import pl.com.bms.springworkshop.model.Client;

public interface ClientService {
    long create(Client client);
    Client read(long id);
    void update(Client client);
    void delete(long id);
}
