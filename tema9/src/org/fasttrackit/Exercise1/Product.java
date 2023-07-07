package org.fasttrackit.Exercise1;

public class Product {
    private int price;
    private String name;
    private String descriprion;
    private int quantity;
    public Product(int price, String name, String descriprion, int quantity){
        this.price = price;
        this.name = name;
        this.descriprion = descriprion;
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    public String getDescriprion() {
        return descriprion;
    }
    public int getQuantity() {
        return quantity;
    }
}
