package com.eskl.groceryseller;

import java.util.ArrayList;
import java.util.List;

public class BasketImpl implements Basket {

    List<GroceryItem> basket;

    public BasketImpl() {
        this.basket = new ArrayList<>();
    }


    @Override
    public void load() {
        System.out.println("items loaded");
    }

    @Override
    public void add(GroceryItem item) {
        basket.add(item);
        System.out.println("item added: " + item);
        System.out.println(basket);
    }

    @Override
    public void remove() {
        System.out.println("item removed");
    }

}
