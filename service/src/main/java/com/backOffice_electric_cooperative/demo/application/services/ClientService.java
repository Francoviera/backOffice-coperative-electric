package com.backOffice_electric_cooperative.demo.application.services;

import com.backOffice_electric_cooperative.demo.domain.models.AdditionalClientInfo;
import com.backOffice_electric_cooperative.demo.domain.models.Client;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService implements DeleteClient, NewClient, RetriewClient, UpdateClient, GetAdditionalClientInfoUseCase {

    private final NewClient newClientImpl;
    private final RetriewClient retriewClientImpl;
    private final UpdateClient updateClientImpl;
    private final DeleteClient deleteClientImpl;
    private final GetAdditionalClientInfoUseCase getAdditionalClientInfoUseCase;

    public ClientService(NewClient newClient, RetriewClient retriewClient, UpdateClient updateClient, DeleteClient deleteClient, GetAdditionalClientInfoUseCase getAdditionalClientInfoUseCase) {
        this.newClientImpl = newClient;
        this.retriewClientImpl = retriewClient;
        this.updateClientImpl = updateClient;
        this.deleteClientImpl = deleteClient;
        this.getAdditionalClientInfoUseCase= getAdditionalClientInfoUseCase;
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

    @Override
    public AdditionalClientInfo getAdditionalClientInfo(Long id) {
        return getAdditionalClientInfoUseCase.getAdditionalClientInfo(id);
    }
}
