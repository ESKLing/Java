package com.eskl.groceryseller;

public class Beer extends GroceryItem {
    private double alcoholContent;

    public Beer(String name, double price, double alcoholContent) {
        super(name, price, "alcohol");
        this.alcoholContent = alcoholContent;
    }

    @Override
    public void consume() {
        System.out.println("I consumed a beer with " + alcoholContent + " alcohol content");
    }

    public double getAlcoholContent() {
        return alcoholContent;
    }

}
