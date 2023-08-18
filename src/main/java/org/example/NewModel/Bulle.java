package org.example.NewModel;

public class Bulle extends Product {
    private String content;
    boolean isEgg;

    //GETTERS AND SETTERS
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isEgg() {
        return isEgg;
    }

    public void setEgg(boolean egg) {
        isEgg = egg;
    }
    //CONSTRUCTOR


    public Bulle(int id, int price, String productName, String content, boolean isEgg) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        this.content = content;
        this.isEgg = isEgg;
    }

    @Override
    public String examine() {
        return ("ID : "+getId()+"Product price : "+getPrice()+"Product Name  : "+getProductName());
    }

    @Override
    public String use() {
        return ("Contains :"+getContent()+" HAVE A NICE DAY ");
    }
}
