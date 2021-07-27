package ru.geekbrains.SpringShopBase.controller;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.SpringShopBase.entity.Cart;


import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("api/v1/cart")
public class CartController {

    @Autowired
    Cart cart;

    int totalQuantity;

    @PostMapping("{id}")
    @ApiOperation("Добавить товар в корзину")
    public String addProductInCart(@PathVariable Long id) {
        cart.put(id);
        totalQuantity++;
        getTotalQuantity();
        return "Товар успешно добавлен в корзину";
    }

    public void getTotalQuantity() {
        System.out.println(totalQuantity);
    }

    @DeleteMapping("/delete/{id}")
    @ApiModelProperty("Удалить товар из корзины")
    public String deleteFromCart(@PathVariable Long id) {
        cart.delete(id);
        totalQuantity--;
        return "Product was deleted from cart successfully";
    }
}
