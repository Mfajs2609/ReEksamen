package Decorator;

public class Milk extends AddonDecorator {
    Beverage beverage;

    //Constructor --> caramel IS A AddonDecorator and a beverage
    public Milk(Beverage b){
        this.beverage = b;
    }

    public int cost(){ // udregner prisen + caramel pris(5)
        return this.beverage.cost() + 2;
    }

    public String getDescription(){
        return this.beverage.getDescription() + "\n +Milk ";
    }
}
