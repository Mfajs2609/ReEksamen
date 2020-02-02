package Decorator;

public class Vanilla extends AddonDecorator {
    Beverage beverage;

    //Constructor --> caramel IS A AddonDecorator and a beverage
    public Vanilla(Beverage b){
        this.beverage = b;
    }

    public int cost(){ // udregner prisen + caramel pris(5)
        return this.beverage.cost() + 7;
    }

    public String getDescription(){
        return this.beverage.getDescription() + "\n +Vanilla ";
    }
}
