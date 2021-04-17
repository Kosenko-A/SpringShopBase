package ru.geekbrains.SpringShopBase.controller;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.SpringShopBase.entity.Cart;
import ru.geekbrains.SpringShopBase.entity.Product;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/cart")
public class CartController {

    @Autowired
    Cart cart;

    @PostMapping("{id}")
    @ApiOperation("Добавить товар в корзину")
    public String addProductInCart(@PathVariable Long id) {
        cart.put(id);
        return "redirect:/";
    }

    @GetMapping
    @ApiOperation("Просмотр товаров в корзине")
    public ArrayList<Optional<Product>> showCart() {
        return cart.get();
    }

    @DeleteMapping("/delete/{id}")
    @ApiModelProperty("Удалить товар из корзины")
    public String deleteFromCart(@PathVariable Long id) {
        cart.delete(id);
        return "redirect:/";
    }
}
