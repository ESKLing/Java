package com.eskl.groceryseller;

import java.util.Arrays;
import java.util.List;

public class GrocerySellerApp {

    public static void main(String[] args) {
        GrocerySellerApp grocerySellerApp = new GrocerySellerApp();
        grocerySellerApp.run();
    }

    public void run() {

        Address benAndElaineAddress = new Address("123 St", "AB1 CD2");
        User ben = new User("BLD", 27, "Senior Engineer", 5.6F, benAndElaineAddress);

        User elaine = new User("ESKL", 24, "Admin", 1, benAndElaineAddress);

        Bread bread = new Bread();

//        GroceryItem apple = new GroceryItem("apple", 0.20, "fruit");

        Beer cass = new Beer("cass", 2.50, 3.9);

        List<GroceryItem> groceryItemList = Arrays.asList(bread,
//                apple,
                cass);
        System.out.println(groceryItemList);

        for (GroceryItem item: groceryItemList) {
            if (item instanceof Beer) {
                Beer beer = (Beer) item;    //creating a new reference of type Beer to the existing instantiated object previously having ref type GroceryItem
                System.out.println(beer.getAlcoholContent());
            }
            if (item instanceof Bread) {
                Bread bread1 = (Bread) item;
                // creating a new var bread1 of ref Bread = the object item is referencing which is cast to Bread
                if (bread1.isLoaf()) {
                    System.out.println("this is a loaf");
                } else {
                    System.out.println("this is not a loaf");
                }
            }
            item.consume();
        }

        Basket basket = new BasketImpl();
        basket.add(bread);
        basket.add(cass);
        basket.load();
        basket.remove();
        // define items
        // load item(s)
        // pick item(s)
        // checkout (buy item(s))
    }

}
