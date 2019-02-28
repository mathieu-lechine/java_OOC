package com.cursan.miam;


import java.util.HashMap;

public class Bill {

    private Customer customer;
    private HashMap<Product,Integer> products;

    // constructeur
    public Bill(Customer customer) {
        this.customer = customer;
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

    public HashMap<Product, Integer> getProducts() {
        return products;
    }

}
