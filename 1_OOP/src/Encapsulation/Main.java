package Encapsulation;

public class Main {

    public static void main(String[] args) {

        Person myObj = new Person();

        /*
        Vil ikke virke
         */
        // myObj.name = "John";  // error "'name' has private access in 'OOP.Encapsulation.Person'"
        // System.out.println(myObj.name); // samme fejl

        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());

        // Giver også mulighed for "read-" eller "write-only"
    }

}
