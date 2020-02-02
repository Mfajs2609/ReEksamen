package Abstraction;

public class Main {
    public static void main(String[] args) {

        Pig myPig = new Pig(); // Create a Pig object
        Goat myGoat = new Goat();
        myPig.animalSound();
        myPig.sleep();
        myGoat.animalSound();
        myGoat.sleep();
    }
}
