package com.backOffice_electric_cooperative.demo.domain.ports.output;

import com.backOffice_electric_cooperative.demo.domain.models.AdditionalClientInfo;

public interface ExternalServicePort {
    AdditionalClientInfo getAdditionalClientInfo(Long id);
}
