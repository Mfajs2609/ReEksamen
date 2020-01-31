package StreamAPI;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class IntSteam {

    static List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,7,8,9);
    public static void main(String[] args) {

        numbers.stream().forEach(number -> System.out.println(number));
        numbers.forEach(number -> System.out.println(number));

        // tal%2==0
        Integer[] evenNumbers = numbers.stream().filter(number -> number%2==0).toArray(Integer[]::new);
        System.out.println(Arrays.toString(evenNumbers));

        IntSummaryStatistics stats = numbers.stream().mapToInt(number -> number).summaryStatistics();
        System.out.println(stats.getAverage());
        System.out.println(stats);
    }

}
