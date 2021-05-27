package com.eskl.groceryseller;

public class Bread
        extends GroceryItem
{

    public Bread() {
        super("bread", 1.99, "bakery");
    }

    public boolean isLoaf() {
        return true;
    }

    @Override
    public void consume() {
        System.out.println("bread consumed");
    }
}
