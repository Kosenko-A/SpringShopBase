package ru.geekbrains.SpringShopBase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.geekbrains.SpringShopBase.entity.Person;
import ru.geekbrains.SpringShopBase.entity.Product;
import ru.geekbrains.SpringShopBase.repository.PersonRepository;
import ru.geekbrains.SpringShopBase.repository.ProductRepository;

import java.util.List;

@Controller
public class WebController {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    PersonRepository personRepository;

    @GetMapping ("/listList")
    public String index(Model model) {
        List<Product> productList = productRepository.findAll();
        model.addAttribute("products", productList);
        return "index";
    }

    @GetMapping("/indexPersons")
    public String indexPersons(Model model) {
        List<Person> personList = personRepository.findAll();
        model.addAttribute("persons", personList);
        return "indexPersons";
    }

    @GetMapping("/login")
    public String showMyLoginPage() {
        return "login";
    }

    @GetMapping("/registration")
    public String showregform() {
        return "registration-form";
    }


}
