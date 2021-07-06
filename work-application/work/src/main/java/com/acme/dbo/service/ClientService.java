package com.acme.dbo.service;

import com.acme.dbo.dao.ClientRepository;
import com.acme.dbo.domain.Client;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class ClientService {
    private ClientRepository clients;

    public ClientService(ClientRepository clients) {
        this.clients = clients;
    }

    public Client create(final String name) {
        return clients.create(new Client(name));
    }

    public Client findById(final int id) {
        return clients.findById(id);
    }

    public Collection<Client> findAll() {
        return clients.findAll();
    }
}
