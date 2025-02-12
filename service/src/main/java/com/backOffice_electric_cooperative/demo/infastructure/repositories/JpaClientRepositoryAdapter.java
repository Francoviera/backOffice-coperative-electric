package com.backOffice_electric_cooperative.demo.infastructure.repositories;

import com.backOffice_electric_cooperative.demo.domain.models.Client;
import com.backOffice_electric_cooperative.demo.domain.ports.output.ClientRepositoryPort;
import com.backOffice_electric_cooperative.demo.infastructure.entities.ClientEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaClientRepositoryAdapter implements ClientRepositoryPort {
    private final JpaClientRepository jpaClientRepository;

    public JpaClientRepositoryAdapter(JpaClientRepository jpaClientRepository) {
        this.jpaClientRepository = jpaClientRepository;
    }

    @Override
    public Client save(Client client) {
        ClientEntity clientEntity = ClientEntity.fromDomainInModel(client);
        
        ClientEntity savedClientEntity= jpaClientRepository.save(clientEntity);
        return savedClientEntity.toDomainModel();
    }

    @Override
    public Optional<Client> findById(Long id) {
        return jpaClientRepository.findById(id)
                .map(ClientEntity::toDomainModel);
    }

    @Override
    public List<Client> findAll() {
        return jpaClientRepository.findAll().stream()
                .map(ClientEntity::toDomainModel)
                //.filter(client -> client.getName().contains("f"))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Client> update(Client client) {
        if(jpaClientRepository.existsById(client.getId())){
            ClientEntity clientEntity = ClientEntity.fromDomainInModel(client);
            ClientEntity updateTaskEntity= jpaClientRepository.save(clientEntity);
            return Optional.of(updateTaskEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean delete(Long id) {
        if(jpaClientRepository.existsById(id)){
            jpaClientRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
