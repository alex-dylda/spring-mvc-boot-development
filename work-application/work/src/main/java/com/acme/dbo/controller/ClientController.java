package com.acme.dbo.controller;

import com.acme.dbo.domain.Client;
import com.acme.dbo.service.ClientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private ClientService service;

    public ClientController(ClientService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client create(@RequestBody final String name) {
        return service.create(name);
    }

    @GetMapping("/{id}")
    public Client findById(@PathVariable final int id) throws ClientNotFoundException {
        Client client = service.findById(id);
        if (client == null) throw new ClientNotFoundException(String.valueOf(id));
        return service.findById(id);
    }

    @GetMapping
    public @ResponseBody Collection<Client> findAll() {
        return service.findAll();
    }
}
