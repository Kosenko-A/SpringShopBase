package ru.geekbrains.SpringShopBase.entity;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

@Data
public class CartDto {
    private List<Product> items;
    private BigDecimal sum;
    private int totalQuantity;

    public CartDto(Cart cart) {

    }
}
