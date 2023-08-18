package org.example.NewModel;

public abstract class Product {
    private int id;
    private String productName;
    private int price;

    public int getId() {
        return id;
    }
    //GETTERS & SETTERS

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //Declaring 2 new abstract  functions
    public abstract String examine();
    public abstract String use();
}
