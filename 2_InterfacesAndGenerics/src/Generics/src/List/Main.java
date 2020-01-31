package Generics.src.List;

import java.util.ArrayList;
//Generics


public class Main {

    public static void main(String[] args) {

        Dog stringDog = new Dog("Shadow", 12);
        Dog intDog = new Dog("Charles", 8);

        stringDog.setType("Shadow");
        intDog.setType(20);


        ArrayList<Dog> dogList = new ArrayList<Dog>();

        dogList.add(new Dog("King," , 3));
        dogList.add(new Dog("Bulder," , 2));
        dogList.add(new Dog("Snebold," , 7));
        dogList.add(new Dog("Nugga," , 9));

        System.out.println(stringDog.getType());
        System.out.println(intDog.getType());

        System.out.println(dogList.toString());


    }
}


