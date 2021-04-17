package ru.geekbrains.SpringShopBase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.SpringShopBase.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}
