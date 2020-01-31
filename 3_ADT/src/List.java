import java.util.LinkedList;

public class List {

    public static void main(String[] args){

        LinkedList<String> objekt = new LinkedList<>();

        //Adding to list
        objekt.add("A");
        objekt.add("B");
        objekt.add("C");
        objekt.add("D");
        objekt.add("E");

        //Removing from list
        objekt.remove(2);

        //Checking for Element in list
        boolean status = objekt.contains("E");

        if (status){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        //Gets the size of list
        int size = objekt.size();
        System.out.println(size);

        System.out.println(objekt.get(3));
    }
}
