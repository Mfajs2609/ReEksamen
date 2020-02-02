package StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("ElEment 1");
        list.add("ElEment 2");
        list.add("ElEment 3");

        Stream<String> stream = list.stream();

        Stream<String> lowercaseStream = stream.map((String element) -> {
            return element.toLowerCase();
        });

        lowercaseStream.forEach((String element) -> {
            System.out.print(element);
        });

        System.out.println("Original List: " +list);
        /*---------------------------------------------*/

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        intList.stream().map(number -> number * 3).forEach(System.out::println);

        System.out.println("Original intList = " +intList);

        /*---------------------------------------------*/
        List<String> filterList = new ArrayList<>();
        filterList.add("Hansen");
        filterList.add("Jensen");
        filterList.add("Kristensen");

        System.out.println("Original filterList= " +filterList);

        // filtrere list efter navne der starter med J
        List<String> result = filterList.stream().filter(s->s.startsWith("J")).collect(Collectors.toList());
        System.out.println("Filtered list= "+result);
        System.out.println("Original filterList= " +filterList);
    }
}
