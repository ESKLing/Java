package com.eskl.groceryseller;

public class Bread
        extends GroceryItem
{
//    double price - don't need this as price is already a field in GroceryItem class;

    public Bread() {
        super("bread", 1.99, "bakery");
    }

    public boolean isLoaf() {
        return true;
    }

    @Override
    public void consume() {
        System.out.println("yummy great bread");
    }
}
