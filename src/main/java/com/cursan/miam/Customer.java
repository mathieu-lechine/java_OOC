package com.cursan.miam;

public class Customer {
    private String fullname;
    private String address;

    // constructor
    public Customer(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    // Getters and setters

    public String getFullname(){
        return fullname;
    }

    public String getAddress(){
        return address;
    }

}
