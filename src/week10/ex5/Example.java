package week10.ex5;


import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {
        String quote = "If you want to find the secrets of the universe, think in terms of energy, frequency and vibration.";


        List<String> words = Stream.of(quote.split(" "))
                .map(e->e.replaceAll(",", ""))
                .map(e->e.replaceAll("\\.", ""))
                .collect(Collectors.toList());
        System.out.println(words);


        System.out.println("How many times words appears: ");
        Map<String, Long> wordsAppearnces = words.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(wordsAppearnces);

        System.out.println("Which words appears the most?");

        Optional<String> mostAppearingWord = wordsAppearnces.entrySet().stream()
                .sorted((e2, e1) -> e1.getValue().compareTo(e2.getValue()))
                .map(e -> e.getKey() + " appears " + e.getValue() + " times.")
                .findFirst();
        if(mostAppearingWord.isPresent())
            System.out.println("The most appearing word is: " + mostAppearingWord.get());


        List<String> mostAppearingThreeLetters = words.stream()
                .map(word -> word.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(3)
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
        System.out.println("Most appearing three letters:");
        mostAppearingThreeLetters.forEach(System.out::println);


        boolean isThereOneWordIsThere = words.stream()
                .map(word -> word.length())
                .anyMatch(length -> length > 6);
        System.out.println("Is there any word? " + isThereOneWordIsThere);


        Map<Integer, List<String>> wordLength = words.stream()
                .collect(Collectors.groupingBy(e -> e.length(), Collectors.toList()));
        System.out.println("words length: ");

wordLength
                .entrySet().stream()
                .sorted((e1,e2) -> e1.getKey().compareTo(e2.getKey()))
                .map(e->e.getKey() + " | " + e.getValue())
                .forEach(e-> System.out.println(e));




    }

}