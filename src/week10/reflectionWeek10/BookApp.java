package week10.reflectionWeek10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookApp {
    public static void main(String[] args) {

        BookReader reader = new BookReader();
        List<String> book = reader.getLines("week10/reflectionWeek10/alice.txt");

        getHowManyWords(book);
        getDistinctWords(book);
        getLongestWord(book);


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
        System.out.println("How many words : " + HowManyWords);
    }

    private static void getLongestWord(List<String> book) {
        Map<Integer, List<String>> wordLength = book.stream()
                .collect(Collectors.groupingBy(String::length));
        wordLength.entrySet().stream()
                .map(Map.Entry::getValue)
                .skip(15)
                .collect(Collectors.toList());
        System.out.println("Longest words: " + wordLength);
    }


}

