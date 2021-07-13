package com.acme.dbo.dao;

import com.acme.dbo.domain.Client;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Repository
public class MapBackedClientRepository implements ClientRepository {
    private Map<Integer, Client> clients = new HashMap<>();

    {
        clients.put(0, new Client("test"));
        clients.put(1, new Client("test2"));
    }

    @Override
    public Client create(Client clientData) {
        Client newClient = new Client(clients.isEmpty() ? 0 :
                Collections.max(clients.keySet()) + 1, clientData.getName());
        clients.put(newClient.getId(), newClient);
        return newClient;
    }

    @Override
    public Client findById(int id) {
        return clients.get(id);
    }

    @Override
    public Collection<Client> findAll() {
        return clients.values();
    }
}
