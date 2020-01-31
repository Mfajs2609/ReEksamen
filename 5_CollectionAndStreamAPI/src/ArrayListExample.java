import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        // Opretter listen
        ArrayList<Integer> list = new ArrayList<>();

        // Tilføjet 4 integers til listen
        list.add(0);
        list.add(1);
        list.add(5);
        list.add(9);

        // Printer listen og listens størrelse
        System.out.println("Original liste " + list + " Size is: " + list.size());

        // Fjerner element på index 2 ("5")
        list.remove(2);

        // Printer elementet på index 2 som vi lige har fjernet og udskriver listens størrelse
        System.out.println("Værdi på index 2: \"" + list.get(2)  + "\" Size is: " + list.size());

        // Ændre elementet på index 1 til en integer med værdien 7
        list.set(1, 7);

        // Printer listen
        System.out.println("Liste efter værdien på index 1 er ændret til 7: " + list);

        // Benytter os af collections til at sorterer listen
        Collections.sort(list);

        // Print listen efter det er sorteret
        System.out.println("Sorteret liste: " + list);

    }
}
