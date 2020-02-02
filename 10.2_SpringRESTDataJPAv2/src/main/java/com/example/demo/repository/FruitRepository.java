package com.example.demo.repository;


import com.example.demo.model.Fruit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FruitRepository extends CrudRepository<Fruit, Long> {

    Iterable<Fruit> findByName(String name);
    Fruit findFruitByName(String name);
    long countByName(String name);
    void deleteByName(String name);

    @Query(value = "SELECT * FROM fruits", nativeQuery = true)
    Iterable<Fruit> findAllCustomQuery();
}

