package com.eskl.groceryseller;

public class Address {
    String street;
    String postcode;

    public Address(String street, String postcode) {
        this.street = street;
        this.postcode = postcode;
    }

    @Override
    public String toString() {
        return street + ", " + postcode;
    }
}
