package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    public int capacity;
    public ArrayList<String> basket;

    public Basket(int capacity) {
        this.basket = new ArrayList<>();
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 1;
        }
    }

    public boolean addBagel(String type){
        if (this.basket.size() < this.capacity) {
            this.basket.add(type);
            return true;
        }
        System.out.println("Basket is full");
        return false;
    }

    public boolean removeBagel(String type) {
        if (this.basket.isEmpty()) {
            System.out.println("Basket is empty");
            return false;
        } else if (this.basket.contains(type)) {
            // Remove only one of type if multiple exists
            for (int i = 0; i < this.basket.size(); i++) {
                if (this.basket.get(i).equals(type)) {
                    this.basket.remove(i);
                    return true;
                }
            }
        }
        System.out.println("No such bagel exists in your basket");
        return false;
    }

    public boolean setCapacity(int capacity) {
        this.capacity = capacity;
        return true;
    }
}
