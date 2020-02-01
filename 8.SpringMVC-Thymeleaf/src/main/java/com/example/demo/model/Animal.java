package com.example.demo.model;



public class Animal {

    private String race;


    private int age;


    private int numberOfLegs;


    private String name;


    private String location;

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
/*
    public Animal(String race, int age, int numberOfLegs, String name, String location) {
        this.race = race;
        this.age = age;
        this.numberOfLegs = numberOfLegs;
        this.name = name;
        this.location = location;
    }

    Animal animal1 = new Animal("Gris", 6, 4, "Bo", "Danmark");
    Animal animal2 = new Animal("Ko", 2, 4, "Jørgen", "Norge");
    Animal animal3 = new Animal("Ged", 8, 4, "Troels", "Sverige");
    Animal animal4 = new Animal("Kylling", 1, 2, "KylleKylle", "Tyskland");

    public List<Animal> animalList = new LinkedList<>();

    public void addAnimal(Animal animal){
        animalList.add(animal1);
        animalList.add(animal2);
        animalList.add(animal3);
        animalList.add(animal4);

    }
*/
}
