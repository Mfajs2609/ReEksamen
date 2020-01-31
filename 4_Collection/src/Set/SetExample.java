package Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    //A Collection represents a single unit of objects, i.e., a group.

    //The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:

    //1. Interfaces and its implementations, i.e., classes
    //2. Algorithm

    //------------Set--------------
    //Set is an interface which extends Collection.
    //It is an unordered collection of objects in which duplicate values cannot be stored.
    //Basically, Set is implemented by HashSet, LinkedHashSet or TreeSet (sorted representation).
    //Set has various methods to add, remove clear, size, etc to enhance the usage of this interface

    public static void main(String[]  args){
    //------------------HashSet---------------------

        Set<String> hashSet1 = new HashSet<>();
        Set<Integer> hashSet2 = new HashSet<>();

        hashSet1.add("En");
        hashSet1.add("To");
        hashSet1.add("Tre");
        hashSet1.add("Fire");
        hashSet1.add("Fem");
        hashSet1.add("Seks");
        hashSet1.add("Syv");
        hashSet1.add("En");
        hashSet1.add("Fem");
        hashSet1.add("Seks");

        hashSet2.add(1);
        hashSet2.add(2);
        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(2);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);

        //Sortere duplikering fra.
        //Intet system i rækkefølgene, kan variere over tid.
        System.out.println("HashSet:");
        System.out.println(hashSet1);
        System.out.println();
        System.out.println(hashSet2);
        System.out.println();

        //------------------TreeSet---------------------
        //Implementere SortedSet, Ordering elemente by their natural ordering.
        System.out.println("TreeSet:");
        System.out.println("Alfabetisk:");
        Set<String> treeSet1 = new TreeSet<>(hashSet1);
        System.out.println(treeSet1);
        System.out.println("Rækkefølge:");
        Set<Integer> treeSet2 = new TreeSet<>(hashSet2);
        System.out.println(treeSet2);
        System.out.println("---------------------");

        //----------------LinkedHashSet---------------

        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();

        linkedSet.add("Amalie");
        linkedSet.add("David");
        linkedSet.add("Charlotte");
        linkedSet.add("Bob");
        linkedSet.add("Erik");
        //Elementer der allerede eksistere kan ikke tilføjes igen.
        linkedSet.add("Bob");

        System.out.println("LinkedHashSet:");
        System.out.println("Størrelse: " + linkedSet.size());
        System.out.println("Original: " + linkedSet);
        System.out.println("Fjerner element(David): " + linkedSet.remove("David"));
        System.out.println("David eksistere: " + linkedSet.contains("David"));
        System.out.println("Ny LinkedHashSet: " + linkedSet);

    }
}
