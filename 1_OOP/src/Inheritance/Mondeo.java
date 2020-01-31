package Inheritance;

public class Mondeo extends Vehicle {

    private String modelName = "Mondeo";
    private int doors = 5;

    public static void main(String[] args) {

        // Create a myCar object
        Mondeo myMondeo = new Mondeo();

        // Call the honk() method (from the Vehicle class) on the myCar object
        myMondeo.honk();

        // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
        System.out.println(myMondeo.brand + " " + myMondeo.modelName);
    }

}
