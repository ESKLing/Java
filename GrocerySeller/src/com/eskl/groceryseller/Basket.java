package com.eskl.groceryseller;

interface Basket {
    void load();
    void add(GroceryItem item);
    void remove();
}
