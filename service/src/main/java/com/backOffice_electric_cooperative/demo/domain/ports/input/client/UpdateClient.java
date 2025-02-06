package com.backOffice_electric_cooperative.demo.domain.ports.input.client;

import com.backOffice_electric_cooperative.demo.domain.models.Client;

import java.util.Optional;

public interface UpdateClient {
    Optional<Client> updateClient(Client client);
}
