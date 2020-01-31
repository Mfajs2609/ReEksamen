package com.example.demo.repository;

import com.example.demo.model.Fruit;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends CrudRepository<Fruit, Long> {

    Iterable<Fruit> findByName(String fruitName);
    Iterable<Fruit> findAll(String fruitName);

}
