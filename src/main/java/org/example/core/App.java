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
            System.out.println("Sale error: " + e.getMessage());
        }
        sale.addProduct(new Product("Shoes", 69.99));
        sale.addProduct(new Product("T-shirt", 45.00));
        sale.addProduct(new Product("Socks", 19.99));

        System.out.println("\n Products in the sale:");
        for (Product p : sale.getShoppingList()) {
            System.out.println("- " + p.getName() + " → $" + p.getPrice());
        }

        try {
            sale.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println("Sale error: " + e.getMessage());
        }

        try {
            int[] index = {1, 2, 3, 4};
            System.out.println(index[8]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index error: " + e.getMessage());
        }

    }
}
