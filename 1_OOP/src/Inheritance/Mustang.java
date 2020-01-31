package Inheritance;


public class Mustang extends Vehicle {
    private String modelName = "Mustang";
    private int doors = 3;


    public static void main(String[] args) {

        // Create a myCar object
        Mustang myMustang = new Mustang();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myMustang.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myMustang.brand + " " + myMustang.modelName);
    }
}
