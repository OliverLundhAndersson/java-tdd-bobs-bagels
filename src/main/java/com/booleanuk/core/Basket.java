package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    public int capacity;
    public ArrayList<String> basket;

    public Basket(int capacity) {
        basket = new ArrayList<>();
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 1;
        }
    }

    public boolean addBagel(String type){
        if (basket.size() < this.capacity) {
            basket.add(type);
            return true;
        }
        System.out.println("Basket is full");
        return false;
    }

    public boolean removeBagel(String type) {
        if (basket.isEmpty()) {
            System.out.println("Basket is empty");
            return false;
        }
        return true;
    }

    public boolean setCapacity(int capacity) {
        return true;
    }
}
