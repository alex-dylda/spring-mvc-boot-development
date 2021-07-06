package com.acme.dbo.controller;

import com.acme.dbo.domain.Client;
import com.acme.dbo.service.ClientService;
import org.springframework.stereotype.Controller;

import java.util.Collection;

@Controller
public class ClientController {
    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    public Client create(final String name) {
        return service.create(name);
    }

    public Client findById(final int id) {
        return service.findById(id);
    }

    public Collection<Client> findAll() {
        return service.findAll();
    }
}
