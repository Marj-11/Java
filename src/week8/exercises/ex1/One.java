package week8.exercises.ex1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class One {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("somewhere", "scenario", "table", "glass", "backpack", "mouse"));
        System.out.println(names);

        names.removeIf(name -> name.endsWith("e"));
        System.out.println(names);

        names.replaceAll(name -> name.toUpperCase());
        System.out.println(names);

        names.removeIf(name -> name.length() < 6);
        System.out.println(names);

        names.forEach(name -> System.out.println(name));


    }
}