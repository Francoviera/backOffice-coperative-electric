package com.backOffice_electric_cooperative.demo.domain.models;

import java.util.List;

public class Merchant {
    private final long id;

    private final String name;

    private final String systemId;

    private final List<Product> products;

    private final String address;

    private final String phone;

    private final String email;

    private final String city;

    private final List<Client> clients;

    public Merchant(long id, String name, String systemId, List<Product> products, String address, String phone, String email, String city, List<Client> clients) {
        this.id = id;
        this.name = name;
        this.systemId = systemId;
        this.products = products;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.city = city;
        this.clients = clients;
    }
}
