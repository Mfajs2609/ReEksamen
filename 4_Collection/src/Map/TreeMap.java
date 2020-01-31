package Map;

public class TreeMap {

//--------------TreeMap----------------//
//Sorted by the natural order of the keys
//Extends AbstractMap, Implements NavigableMap and SortedMap

    static void TreeMap() {
        java.util.TreeMap<Integer, String> treeMap = new java.util.TreeMap<>();

        //tilføjer elementer med put skal angive key og value.
        treeMap.put(5, "Jonas");
        treeMap.put(20, "Tobias");
        treeMap.put(25, "Mathias");
        treeMap.put(10, "Thomas");
        treeMap.put(15, "Frank");
        treeMap.put(30, "Oliver");

        System.out.println("treemap:" + treeMap);

        //fjerner element med key
        treeMap.remove(25);
        System.out.println(treeMap);
        //finder element ud fra key
        System.out.println(treeMap.get(10));

    }

        public static void main(String[] args){
            //constructor
            TreeMap();
        }

    }
