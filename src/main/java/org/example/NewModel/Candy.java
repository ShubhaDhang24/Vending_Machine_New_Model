package org.example.NewModel;

public class Candy extends Product {
    private String content;
    boolean isVegan;

    //GETTERS & SETTERS
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }

    //Constructor


    public Candy(int id, int price,String productName,String content, boolean isVegan)
    {
        setId(id);
        setPrice(price);
        setProductName(productName);
        this.content = content;
        this.isVegan = isVegan;
    }

    @Override
    public String examine() {
        return ("ID : "+getId()+"Product price : "+getPrice()+"Product Name  : "+getProductName());
    }

    @Override
    public String use() {
        return ("Contains :"+getContent()+ (isVegan()?"Its vegan Product":" -Not Vegan-"+" VISIT AGAIN "));
    }
}
