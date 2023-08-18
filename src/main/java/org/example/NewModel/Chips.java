package org.example.NewModel;

public class Chips extends Product {
     private String content;

    public Chips(String content) {
        this.content = content;
    }

    //GETTERS & SETTERRS
    public String getContent() {
        return content;
    }
    //CONSTRUCTORS
    public void setContent(int id, int price, String productName,String content) {
        setId(id);
        setPrice(price);
        setProductName(productName);
        this.content = content;
    }

    @Override
    public String examine() {
        return ("ID :"+getId()+", price sek :"+getPrice()+", Product name :"+getProductName());
    }

    @Override
    public String use() {
        return ("Contains :"+getContent()+" -HAVE A NICE DAY- ");
    }
}
