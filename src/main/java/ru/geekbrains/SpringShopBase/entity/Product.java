package ru.geekbrains.SpringShopBase.entity;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id", nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 128)
    @ApiModelProperty(value = "Название товара", required = true)
    private String name;

    @Column(name = "price")
    @ApiModelProperty(value = "Цена товара", required = true)
    private int price;


    public Product() {
        UUID.randomUUID();
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    @Transactional
    public String toString() {
        return String.format("id: %s, name: %s, price: %s", id, name, price);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
