package com.backOffice_electric_cooperative.demo.domain.ports.input.client;

import com.backOffice_electric_cooperative.demo.domain.models.AdditionalClientInfo;

public interface GetAdditionalClientInfoUseCase {
    AdditionalClientInfo getAdditionalClientInfo(Long id);
}
