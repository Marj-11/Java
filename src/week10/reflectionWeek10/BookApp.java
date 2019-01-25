package week10.reflectionWeek10;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookApp {
    public static void main(String[] args) {

        BookReader reader = new BookReader();
        List<String> book = reader.getLines("week10/reflectionWeek10/alice.txt");

        getHowManyWords(book);
        getDistinctWords(book);
        getLongestWord(book);
        getMostAppearingWords(book);
        getMostAppearingThreeLetters(book);


    }

    private static void getMostAppearingThreeLetters(List<String> book) {
        List<String> mostAppearingThreeLetters = book.stream()
                .map(e -> e.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getValue() + " | " + e.getKey())
                .collect(Collectors.toList());
        mostAppearingThreeLetters
                .forEach(e -> System.out.println(e));

    }


    private static void getDistinctWords(List<String> book) {
        long distinctWords = book.stream()
                .distinct()
                .count();
        System.out.println("Number of distinct words: " + distinctWords);
    }


    private static void getHowManyWords(List<String> book) {
        long HowManyWords = book.stream()
                .count();
        System.out.println("Number of words : " + HowManyWords);
    }

    private static void getLongestWord(List<String> book) {
        List<String> longest = book.stream()
                .collect(Collectors.groupingBy(e -> Integer.valueOf(e.length()), Collectors.toList()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .limit(1)
                .flatMap(e-> e.getValue().stream())
                .collect(Collectors.toList());
        System.out.println("Longest word: " + longest);

    }

    private static void getMostAppearingWords(List<String> book) {
        List<String> mostAppearingWords = book.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(5)
                .map(e -> e.getValue() + " | " + e.getKey())
                .collect(Collectors.toList());
        System.out.println("most appearing 5 words: ");

        mostAppearingWords
                .forEach(e -> System.out.println(e));
        System.out.println("most appearing 5 letters: ");
    }

}

