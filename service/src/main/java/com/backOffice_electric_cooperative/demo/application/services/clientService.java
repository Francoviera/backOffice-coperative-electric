package com.backOffice_electric_cooperative.demo.application.services;

import com.backOffice_electric_cooperative.demo.domain.models.Client;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.DeleteClient;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.NewClient;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.RetriewClient;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.UpdateClient;

import java.util.List;
import java.util.Optional;

public class clientService implements DeleteClient, NewClient, RetriewClient, UpdateClient {

    @Override
    public boolean deleteClient(Long id) {
        return false;
    }

    @Override
    public Client newClient(Client client) {
        return null;
    }

    @Override
    public Optional<Client> updateClient(Client client) {
        return Optional.empty();
    }

    @Override
    public Optional<Client> getClient(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Client> getAllClients() {
        return List.of();
    }
}
