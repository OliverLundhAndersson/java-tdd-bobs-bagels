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
        } else if (basket.contains(type)) {
            // Remove only one of type if multiple exists
            for (int i = 0; i < basket.size(); i++) {
                if (basket.get(i).equals(type)) {
                    basket.remove(i);
                    return true;
                }
            }
        }
        System.out.println("No such bagel exists in your basket");
        return false;
    }

    public boolean setCapacity(int capacity) {
        return true;
    }
}
