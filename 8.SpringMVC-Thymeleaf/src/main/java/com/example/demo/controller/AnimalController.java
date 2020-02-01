package com.example.demo.controller;

import com.example.demo.model.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class AnimalController {


    @GetMapping("/")
    public String getIndex(){
        return "MainMenu";
    }

    @GetMapping("/animalinfo")
    public String getAnimalInfo(Model model){
        Animal animal = new Animal();

        animal.setRace("Ko");
        animal.setName("Biver");
        animal.setAge(7);
        animal.setNumberOfLegs(4);
        animal.setLocation("Denmark");

        model.addAttribute("animal", animal);

        return "AnimalInfo";
    }


}
