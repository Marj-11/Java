package week10.reflectionWeek10;

import java.util.List;
import java.util.stream.Collectors;

public class BookApp {
    public static void main(String[] args) {

        BookReader reader = new BookReader();
        List<String> book = reader.getLines("week10/reflectionWeek10/alice.txt");

        getHowManyWords(book);
        getDistinctWords(book);


    }

    private static void getDistinctWords(List<String> book) {
        long distinctWords = book.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getValue())
                .distinct()
                .count();
        System.out.println("Number of distinct words: " + distinctWords);
    }


    private static void getHowManyWords(List<String> book) {
        long HowManyWords = book.stream()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .map(e -> e.getValue())
                .count();
        System.out.println("How many words : " + HowManyWords);
    }

// spend lots of time on small mistakes :/


}

