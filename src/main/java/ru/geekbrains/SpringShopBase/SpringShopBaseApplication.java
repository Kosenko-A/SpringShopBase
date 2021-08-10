package ru.geekbrains.SpringShopBase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringShopBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringShopBaseApplication.class, args);
	}

}
