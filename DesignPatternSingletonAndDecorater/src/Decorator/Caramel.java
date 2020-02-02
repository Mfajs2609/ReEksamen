package Decorator;


public class Caramel extends AddonDecorator {

    Beverage beverage;

    //Constructor --> caramel IS A AddonDecorator and a beverage
    public Caramel(Beverage b){
        this.beverage = b;
    }

    public int cost(){ // udregner prisen + caramel pris(5)
        return this.beverage.cost() + 5;
    }

    public String getDescription(){
        return this.beverage.getDescription() + "\n +Caramel ";
    }
}
