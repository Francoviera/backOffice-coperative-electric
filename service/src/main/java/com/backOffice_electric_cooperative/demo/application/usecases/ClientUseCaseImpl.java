package com.backOffice_electric_cooperative.demo.application.usecases;

import com.backOffice_electric_cooperative.demo.domain.models.Client;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.DeleteClient;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.NewClient;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.UpdateClient;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.RetriewClient;
import com.backOffice_electric_cooperative.demo.domain.ports.output.ClientRepositoryPort;

import java.util.List;
import java.util.Optional;

class CreateClientImpl implements NewClient {
    private final ClientRepositoryPort clientRepositoryPort;

    CreateClientImpl(ClientRepositoryPort clientRepositoryPort) {
        this.clientRepositoryPort = clientRepositoryPort;
    }

    @Override
    public Client newClient(Client client) {
        return clientRepositoryPort.save(client);
    }
}
class updateClientImpl implements UpdateClient {
    private final ClientRepositoryPort clientRepositoryPort;

    updateClientImpl(ClientRepositoryPort clientRepositoryPort) {
        this.clientRepositoryPort = clientRepositoryPort;
    }

    @Override
    public Optional<Client> updateClient(Client client) {
        return clientRepositoryPort.update(client);
    }
}
class deleteClientImpl implements DeleteClient {
    private final ClientRepositoryPort clientRepositoryPort;

    deleteClientImpl(ClientRepositoryPort clientRepositoryPort) {
        this.clientRepositoryPort = clientRepositoryPort;
    }

    @Override
    public boolean deleteClient(Long id) {
        return clientRepositoryPort.delete(id);
    }
}
class retriviewClientImpl implements RetriewClient{
    private final ClientRepositoryPort clientRepositoryPort;

    retriviewClientImpl(ClientRepositoryPort clientRepositoryPort) {
        this.clientRepositoryPort = clientRepositoryPort;
    }

    @Override
    public Optional<Client> getClient(String id) {
        return clientRepositoryPort.findById(id);
    }

    @Override
    public List<Client> getAllClients() {
        return clientRepositoryPort.findAll();
    }
}
