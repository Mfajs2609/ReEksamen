package Decorator;

public class FilterCoffee extends Beverage {
    public int cost(){
        return 25;
    }
    public String getDescription(){
        return "Filter coffee ";
    }
}
