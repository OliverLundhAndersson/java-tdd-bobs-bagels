package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    public void testCreateBasket() {
        Basket basket1 = new Basket(1);
        Basket basketM1 = new Basket(-1);
        Basket basket5 = new Basket(5);

        assertEquals(1, basket1.capacity);
        assertEquals(1, basketM1.capacity);
        assertEquals(5, basket5.capacity);
    }

    @Test
    public void testAddToBasket() {
        Basket basket = new Basket(2);

        boolean b1 = basket.addBagel("1");
        boolean b2 = basket.addBagel("2");
        boolean b3 = basket.addBagel("3");

        assertTrue(b1);
        assertTrue(b2);
        assertFalse(b3);
    }


    @Test
    public void testRemoveFromBasket() {
        Basket basket = new Basket(2);

        boolean b1 = basket.removeBagel("1");
        assertFalse(b1);

        basket.addBagel("1");
        boolean b2 = basket.removeBagel("1");
        boolean b3 = basket.removeBagel("1");

        assertTrue(b2);
        assertFalse(b3);

        basket.addBagel("1");
        boolean b4 = basket.removeBagel("2");
        assertFalse(b4);
    }

    @Test
    public void testSetCapacity() {
        Basket basket = new Basket(2);
        basket.setCapacity(3);
        assertEquals(3, basket.capacity);

        boolean b1 = basket.setCapacity(-1);
        assertFalse(b1);

        basket.addBagel("1");
        basket.addBagel("2");
        boolean b2 = basket.setCapacity(1);
        assertFalse(b2);
    }
}
