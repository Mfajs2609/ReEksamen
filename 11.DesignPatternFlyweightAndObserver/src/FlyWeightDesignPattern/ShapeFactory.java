package DesignPatterns.FlyWeightDesignPattern;

import java.util.HashMap;

public class ShapeFactory {
    private static final HashMap circleMap = new HashMap();

    public static Shape getCircle(String color){
        Circle circle = (Circle)circleMap.get(color);

        //Laver check om objektet allerede eksistere - hvis det gør, så genere ikke et nyt
        if(circle==null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating a circle of color: " +color);
        }
        return circle;
    }


}
