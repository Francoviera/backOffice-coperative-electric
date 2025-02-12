package com.backOffice_electric_cooperative.demo.domain.models;

public class Client {
    private final long id;
    private final String name;

    private final String adress;

    private final String phone;

    private final String email;

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public Client(long id, String name, String adress, String phone, String email) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.phone = phone;
        this.email = email;
    }
}
