package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final List<Product> ShoppingList;
    private double totalPrice;

    public Sale() {
        ShoppingList = new ArrayList<>();
        totalPrice = 0.0;
    }

    public void calculateTotal() throws EmptySaleException {
        if (ShoppingList.isEmpty()) {
            throw new EmptySaleException("To make a sale you must first add products");
        }
        double totalPrice = 0.0;
        for (Product p : ShoppingList) {
            totalPrice += p.getPrice();
            System.out.println("The total price is: " + totalPrice + "$");

        }

    }

    public List<Product> getShoppingList() {
        return ShoppingList;
    }

}
