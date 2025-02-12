package com.backOffice_electric_cooperative.demo.infastructure.config;

import com.backOffice_electric_cooperative.demo.application.services.ClientService;
import com.backOffice_electric_cooperative.demo.application.usecases.*;
import com.backOffice_electric_cooperative.demo.domain.ports.input.client.GetAdditionalClientInfoUseCase;
import com.backOffice_electric_cooperative.demo.domain.ports.output.ClientRepositoryPort;
import com.backOffice_electric_cooperative.demo.domain.ports.output.ExternalServicePort;
import com.backOffice_electric_cooperative.demo.infastructure.adapters.ExternalServiceAdapter;
import com.backOffice_electric_cooperative.demo.infastructure.repositories.JpaClientRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class ApplicationConfig {
    @Bean
    public ClientService clientService(ClientRepositoryPort clientRepositoryPort,
                                       @Lazy GetAdditionalClientInfoUseCase getAdditionalClientInfoUseCase){
        return new ClientService(
                new CreateClientImpl(clientRepositoryPort),
                new RetrieveClientImpl(clientRepositoryPort),
                new UpdateClientImpl(clientRepositoryPort),
                new DeleteClientImpl(clientRepositoryPort),
                getAdditionalClientInfoUseCase
        );
    }
    @Bean
    public ClientRepositoryPort clientRepositoryPort(JpaClientRepositoryAdapter jpaClientRepositoryAdapter){
        return jpaClientRepositoryAdapter;
    }
    @Bean
    public GetAdditionalClientInfoUseCase getAdditionalClientInfoUseCase(ExternalServicePort externalServicePort){
        return new GetAdditionalClientInfoUseCaseImpl(externalServicePort);
    }
    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }
}
