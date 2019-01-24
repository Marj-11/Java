package week9.ex2;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

    private FileReader reader = new FileReader();
    private List<String> names = reader.asList("week9/ex2/names.txt");


    @Test
    void shortNames(){
        List<String> actual = names.stream()
                .filter(e -> e.length()<4)
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("El");
        Assertions.assertEquals(expected, actual);

        System.out.println("Names that are shorter than four characters: ");
        System.out.println(actual);

    }
    @Test
    void upperCase(){
        List<String> actual = names.stream()
                .filter(e -> e.endsWith("m"))
                .map(e -> e.toUpperCase())
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("HOSAM", "TAMMAM");
        Assertions.assertEquals(expected, actual);

        System.out.println("Names that end with m uppercased: \n" + actual);
    }

    @Test
    void lowerCase(){
        List<String> actual = names.stream()
                .filter(e -> e.contains("r"))
                .filter(e -> e.contains("e"))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("Mehran", "Norbert", "Serife");
        Assertions.assertEquals(expected, actual);

        System.out.println("Names that contain the letter e and the letter r: ");
        System.out.println(actual);

    }

    @Test
    void contain(){
        List<String> actual = names.stream()
                .map(e -> e.toLowerCase())
                .filter(e -> e.contains("m"))
                .filter(e -> e.contains("a"))
                .filter(e -> e.length()<5)
                .map(e -> e.replaceAll("a", "aa"))
                .collect(Collectors.toList());
        List<String> expected = Arrays.asList("maarj", "aamin", "omaar");
        Assertions.assertEquals(expected, actual);

        System.out.println("Names that are 4 letters long in lowercase and contain the letter a and m with double a’s: ");
        System.out.println(actual);

    }





}
