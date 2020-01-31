package Polymorphism;

public class Animal {

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }

    public void animalSound(String animal, String sound) {
        System.out.println("This " + animal + " says: " + sound);
    }

}
