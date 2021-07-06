package com.acme.dbo.service;

import com.acme.dbo.dao.ClientRepository;
import com.acme.dbo.domain.Client;

import java.util.Collection;

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
