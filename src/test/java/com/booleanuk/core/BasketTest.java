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
}
