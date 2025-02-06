package com.backOffice_electric_cooperative.demo.application.services;

import com.backOffice_electric_cooperative.demo.domain.models.Client;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.DeleteClient;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.NewClient;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.RetriewClient;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.UpdateClient;

import java.util.List;
import java.util.Optional;

public class clientService implements DeleteClient, NewClient, RetriewClient, UpdateClient {

    private final NewClient newClientImpl;
    private final RetriewClient retriewClientImpl;
    private final UpdateClient updateClientImpl;
    private final DeleteClient deleteClientImpl;

    public clientService(NewClient newClient, RetriewClient retriewClient, UpdateClient updateClient, DeleteClient deleteClient) {
        this.newClientImpl = newClient;
        this.retriewClientImpl = retriewClient;
        this.updateClientImpl = updateClient;
        this.deleteClientImpl = deleteClient;
    }


    @Override
    public boolean deleteClient(Long id) {
        return deleteClientImpl.deleteClient(id);
    }

    @Override
    public Client newClient(Client client) {
        return newClientImpl.newClient(client);
    }

    @Override
    public Optional<Client> updateClient(Client client) {
        return updateClientImpl.updateClient(client);
    }

    @Override
    public Optional<Client> getClient(Long id) {
        return retriewClientImpl.getClient(id);
    }

    @Override
    public List<Client> getAllClients() {
        return retriewClientImpl.getAllClients();
    }
}
