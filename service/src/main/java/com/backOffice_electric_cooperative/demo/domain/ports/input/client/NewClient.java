package com.backOffice_electric_cooperative.demo.domain.ports.input.client;

import com.backOffice_electric_cooperative.demo.domain.models.Client;

public interface NewClient {
    Client newClient(Client client);
}
