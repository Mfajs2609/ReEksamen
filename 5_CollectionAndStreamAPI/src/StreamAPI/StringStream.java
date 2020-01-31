package StreamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

public class StringStream {

    public static void main(String[] args) {
        Collection<String> words = Arrays.asList("Hej", "Farvel", "Goddag", "Hej Hej", " ", "Hejsa");

        Collection<String> onlyWordsParallel = words.parallelStream().filter(word -> !word.isEmpty()).collect(Collectors.toList());
        Collection<String> onlyWords = words.stream().filter(word -> !word.isEmpty()).collect(Collectors.toList());
        System.out.println(onlyWords);

        String sentence = words.stream().collect(Collectors.joining(" "));
        String sentenceWithNoEmpty = words.stream().filter(word -> !word.isEmpty()).collect(Collectors.joining(" "));
        System.out.println(sentence);

        long vocabulary = words.stream().filter(word -> !word.isEmpty()).count();
        System.out.println(vocabulary);
    }

}

