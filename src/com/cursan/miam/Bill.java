package com.cursan.miam;
import java.util.Map;

import java.util.HashMap;

public class Bill {

    private Customer customer;
    private Map<Product,Integer> products = new HashMap<Product, Integer>();
    private Delivery delivery;

    // constructeur
    public Bill(Customer customer, Delivery delivery) {
        this.customer = customer;
        this.delivery = delivery;
    }

    /**
     * Add a product with a quantity in the bill
     * @param product product to add
     * @param quantity quantity of the product
     */
    public void addProduct(Product product, Integer quantity){
        if(products.containsKey(product)){
            products.put(product, products.get(product) + quantity);
        } else {
            products.put(product, quantity);
        }
    }

    public Customer getCustomer() {
        return customer;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

}
