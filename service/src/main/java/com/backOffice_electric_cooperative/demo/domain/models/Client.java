package com.backOffice_electric_cooperative.demo.domain.models;

public class Client {
    private final String name;

    private final String adress;

    private final String phone;

    private final String email;

    public Client(String name, String adress, String phone, String email) {
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }
}
