package com.example.demo.controller.api;

import com.example.demo.model.Fruit;
import com.example.demo.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class MainApi {


   @Autowired
   FruitRepository fruitRepository;


    @GetMapping("/fruits")
    public Iterable<Fruit> viewFruitList(){
        return fruitRepository.findAll();
    }

}
