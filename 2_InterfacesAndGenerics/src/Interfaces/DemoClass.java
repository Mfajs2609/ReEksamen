package Interfaces;
//implementere interface,
//kan ikke oprettet et objekt i en interface klasse.
//Sikre at man kun viser de vigtige detailjer i et objekt.
//Man overrider
//Man kan kun nedarve fra en superklasse, multible inheritance er ikke understyttet.
//Dog kan man implementere flere interfaces med implements.

public class DemoClass implements FirstInterface, SecondInterface {

    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }

}
