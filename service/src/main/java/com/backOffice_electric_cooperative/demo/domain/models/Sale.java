package com.backOffice_electric_cooperative.demo.domain.models;

import java.util.List;

public class Sale {
    private final long id;

    private final String systemId;

    private final List<Product> products;

    private final String grossAmount;

    private final String netAmount;

    private final String quotas;

    private final String date;

    private final String paymentMethod;

    public Sale(long id, String systemId, List<Product> products, String grossAmount, String netAmount, String quotas, String date, String paymentMethod) {
        this.id = id;
        this.systemId = systemId;
        this.products = products;
        this.grossAmount = grossAmount;
        this.netAmount = netAmount;
        this.quotas = quotas;
        this.date = date;
        this.paymentMethod = paymentMethod;
    }
}
