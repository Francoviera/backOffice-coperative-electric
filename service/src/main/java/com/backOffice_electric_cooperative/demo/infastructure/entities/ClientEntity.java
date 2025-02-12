package com.backOffice_electric_cooperative.demo.infastructure.entities;


import com.backOffice_electric_cooperative.demo.domain.models.Client;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ClientEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;
    private String name;

    public long getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    private String email;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    private String phone;
    private String address;

    public ClientEntity() {}

    public ClientEntity(long id, String name, String email, String phone, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    public Client toDomainModel(){
        return new Client(id,name,email,phone,address);
    }

    public static ClientEntity fromDomainInModel(Client client){
        return new ClientEntity(client.getId(), client.getName(), client.getEmail(), client.getPhone(), client.getAdress());
    }
}
