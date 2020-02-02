package com.example.demo.controller;

import com.example.demo.model.Fruit;
import com.example.demo.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class FruitController {

    @Autowired
    FruitRepository fruitRepository;

    @GetMapping("/fruit")
    public Iterable<Fruit> getListOfFruits() {
        return fruitRepository.findAll();
    }

    @GetMapping("/findFruit")
    public Iterable<Fruit> findOneFruit(@RequestParam(value = "name") String name) {
        return fruitRepository.findByName(name);
    }

    @PostMapping("/fruit")
    public Fruit addNewFruit(@RequestBody Fruit fruit){
        return fruitRepository.save(fruit);

    }

    @PutMapping("/fruit/{name}")
    public String updateFruit(@PathVariable String name, @RequestBody Fruit fruit) {
        Iterable<Fruit> foundFruit = fruitRepository.findByName(name);
        if (foundFruit != null) {
            if (fruitRepository.countByName(name) < 1) {
                return "No fruit named: " + name + " in table fruit";
            } else if (fruitRepository.countByName(name) > 1) {
                return "More than one fruit named: " + name + "in table fruit, please request by ID instead of name ";
            } else {
                Fruit newFruit = fruitRepository.findFruitByName(name);
                newFruit.setName(fruit.getName());
                fruitRepository.save(newFruit);
                return "Fruit updated";
            }
        } else {
            return "Fruit not found";

        }
    }

    @DeleteMapping("/fruit/{name}")
    public String deleteFruitFromDB(@PathVariable String name) {
        Iterable<Fruit> foundFruit = fruitRepository.findByName(name);
        if (foundFruit != null) {
            if (fruitRepository.countByName(name) < 1) {
                return "No fruit named: " + name + " in table fruit";
            } else if (fruitRepository.countByName(name) > 1) {
                return "More than one fruit named: " + name + " in table fruit, please request by ID instead of name ";
            } else {
                fruitRepository.deleteByName(name);
                return "Fruit deleted";
            }
        } else {
            return "Fruit not found";
        }

    }
}
















