package Decorator;

public class Main {

    public static void main(String[] args) {

        Beverage b = new Caramel(new Vanilla(new Espresso()));
        System.out.println("Order: "+ b.getDescription() +"\nPrice: " + b.cost());

        Beverage b2 = new Milk(new Caramel(new FilterCoffee()));
        System.out.println("\nOrder: "+b2.getDescription() + "\nPrice: " + b2.cost());

        Beverage b3 = new Milk(new Espresso());
        System.out.println("\nOrder: "+b3.getDescription() + "\nPrice: " + b3.cost());
    }
}
