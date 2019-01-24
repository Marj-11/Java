package week9.ex4;

import week9.ex2.FileReader;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class HappinessApplication {

    public static void main(String[] args) {

        FileReader reader = new FileReader();
        Stream<String> records = reader.asStream("week9/ex4/world-happiness-2017.csv");

        records
                .skip(1)
                .map(e -> e.split(";"))
                .map(e -> Arrays.asList(e))
                .map(e -> new HappinessRecord(e.get(0), Integer.valueOf(e.get(1)), Double.valueOf(e.get(2))))
                .sorted(Comparator.comparing(e->e.getCountry()  ))
                .limit(5)
                .forEach(e -> System.out.println(e));


    }
}
