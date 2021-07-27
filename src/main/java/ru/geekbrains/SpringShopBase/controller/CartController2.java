package ru.geekbrains.SpringShopBase.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.geekbrains.SpringShopBase.entity.Cart;
import ru.geekbrains.SpringShopBase.entity.Product;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class CartController2 {

    @Autowired
    Cart cart;

    @GetMapping("api/v1/cart")
    @ApiOperation("Просмотр товаров в корзине")
    public String showCart(Model model) {
        List<Product> productList = cart.get().stream()
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());
        model.addAttribute("products", productList);
        return "cart";
    }


}
