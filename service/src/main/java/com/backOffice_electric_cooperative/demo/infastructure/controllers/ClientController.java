package com.backOffice_electric_cooperative.demo.infastructure.controllers;

import com.backOffice_electric_cooperative.demo.application.services.ClientService;
import com.backOffice_electric_cooperative.demo.domain.models.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/client")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        Client createClient= clientService.newClient(client);
        return new ResponseEntity<>(createClient, HttpStatus.CREATED);
    }

    @GetMapping("/{clientId}")
    public ResponseEntity<Client> getClient(@PathVariable Long clientId) {
        return clientService.getClient(clientId)
                .map(client -> new ResponseEntity<>(client, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        List<Client> clients = clientService.getAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }
    @PutMapping("/{clientId}")
    public ResponseEntity<Client> updateClient(@RequestBody Client client) {
        return clientService.updateClient(client)
                .map(client1 -> new ResponseEntity<>(client, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @DeleteMapping("/{clientId}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long clientId) {
        if(clientService.deleteClient(clientId)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
