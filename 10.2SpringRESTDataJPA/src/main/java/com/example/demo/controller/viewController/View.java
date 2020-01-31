package com.example.demo.controller.viewController;

import com.example.demo.model.Fruit;
import com.example.demo.repository.FruitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class View {


    @GetMapping(value = "/")
    public String mainMenu(){
        System.out.println("TEST");
        return "mainmenu.html";
    }





}
