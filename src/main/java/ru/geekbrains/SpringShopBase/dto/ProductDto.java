package ru.geekbrains.SpringShopBase.dto;

import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class ProductDto {

    @NotBlank
    @ApiModelProperty(value = "Название товара", required = true)
    private String name;

    @NotNull
    @ApiModelProperty(value = "Цена товара", required = true)
    private int price;

    public ProductDto() {

    }

    public String getName() {
        return name;
    }

    public void setName(String title) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
