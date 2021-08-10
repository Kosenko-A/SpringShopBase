package ru.geekbrains.SpringShopBase;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.geekbrains.SpringShopBase.controller.CartController;
import ru.geekbrains.SpringShopBase.entity.Cart;


public class TestCartJunit {

    Cart cart;

    @Before
    public void init() {
        cart = new Cart();
    }

    @Test
    public void putInCart() {
        Assert.assertEquals("successfully", cart.put(5L));
    }
}
