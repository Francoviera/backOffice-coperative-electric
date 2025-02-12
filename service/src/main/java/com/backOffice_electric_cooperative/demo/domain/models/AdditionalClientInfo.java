package com.backOffice_electric_cooperative.demo.domain.models;

public class AdditionalClientInfo {
    private final long clientId;
    private final String clientName;
    private final String clientEmail;

    public AdditionalClientInfo(long clientId, String clientName, String clientEmail) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientEmail = clientEmail;
    }

    public long getClientId() {
        return clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public String getClientEmail() {
        return clientEmail;
    }
}
