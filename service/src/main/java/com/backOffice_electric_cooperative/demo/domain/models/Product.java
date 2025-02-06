package com.backOffice_electric_cooperative.demo.domain.models;

public class Product {
    private final long id;

    private final String name;

    private final String description;

    private final double price;

    public Product(long id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
