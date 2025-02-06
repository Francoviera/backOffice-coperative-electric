package com.backOffice_electric_cooperative.demo.domain.ports.output;

import com.backOffice_electric_cooperative.demo.domain.models.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepositoryPort {
    Client save(Client client);
    Optional<Client> findById(String id);
    List<Client> findAll();
    Optional<Client> update (Client client);
    boolean delete(String id);

}
