package ru.geekbrains.SpringShopBase.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import ru.geekbrains.SpringShopBase.repository.ProductRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;

@Configuration
public class Cart {

    HashMap<Long, Optional<Product>> cart = new HashMap<Long, Optional<Product>>();

    @Autowired
    ProductRepository productRepository;

    public String put(Long id) {
        Optional<Product> product = productRepository.findById(id);
        cart.put(id, product);
        return "successfully";
    }

    public ArrayList<Optional<Product>> get() {
        ArrayList<Optional<Product>> names = new ArrayList<>(cart.values());
        return names;
    }

    public void delete(Long id) {
        cart.remove(id);
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cart=" + cart +
                ", productRepository=" + productRepository +
                '}';
    }
}

