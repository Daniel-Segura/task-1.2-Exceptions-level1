package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Sale {
    private final List<Product> shoppingList;
    public double totalPrice;

    public Sale() {
        this.shoppingList = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public List<Product> getShoppingList() {
        return List.copyOf(shoppingList);
    }

    public void addProduct(Product p){
        this.shoppingList.add(p);
    }

    public void calculateTotal() throws EmptySaleException {
        if (shoppingList.isEmpty()) {
            throw new EmptySaleException("To make a sale you must first add products");
        }
        this.totalPrice = 0.0;
        for (Product p : shoppingList) {
            this.totalPrice += p.getPrice();
        }
        System.out.println("The total price is: " + totalPrice + "$");
    }

    @Override
    public String toString() {
        return "Sale{" +
                "ShoppingList=" + shoppingList +
                ", totalPrice=" + totalPrice +
                "$"+ "}";
    }
}
