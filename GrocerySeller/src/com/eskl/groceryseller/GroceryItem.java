package com.eskl.groceryseller;

public abstract class GroceryItem {
    private String name;     // only this class has access to this field
    double price;
    String type;

    public GroceryItem(String name, double price, String type) {
        this.name = name;   //this keyword to distinguish between the field and param
        this.price = price;
        this.type = type;
    }

    public abstract void consume();

    public String getName() {    //allows other classes to get the name
        return name;
    }

    @Override
    public String toString() {
        return "GroceryItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
