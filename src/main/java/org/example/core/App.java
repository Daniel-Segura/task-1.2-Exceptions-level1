package org.example.core;

import org.example.model.EmptySaleException;
import org.example.model.Product;
import org.example.model.Sale;

public class App {
    public void executor() {
        Sale sale = new Sale();

        try {
            sale.calculateTotal();

        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
        sale.getShoppingList().add(new Product("Shoes", 69.99));
        sale.getShoppingList().add(new Product("T-shirt", 45.00));
        sale.getShoppingList().add(new Product("Socks", 19.99));

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        try {
            int[] index = {1, 2, 3, 4};
            System.out.println(index[8]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
