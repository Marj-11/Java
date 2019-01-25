package week10.reflectionWeek10;

import week9.ex2.FileReader;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BookReader {

    private FileReader reader = new FileReader();

    public List<String> getLines(String filepath) {
        return reader.asStream(filepath)
                .map(String::toLowerCase)
                .map(e->e.replaceAll(",", " "))
                .map(e->e.replaceAll(";", " "))
                .map(e->e.replaceAll(":", " "))
                .map(e->e.replaceAll(";", " "))
                .map(e->e.replaceAll("#", " "))
                .map(e->e.replaceAll("/", " "))
                .map(e->e.replaceAll("-", " "))
                .map(e->e.replaceAll("\\.", " "))
                .map(e->e.replaceAll("\\*", " "))
                .map(e->e.replaceAll("\\(", " "))
                .map(e->e.replaceAll("\\)", " "))
                .map(e->e.replaceAll("\\[", " "))
                .map(e->e.replaceAll("\\]", " "))
                .map(e->e.replaceAll("’", " "))
                .map(e->e.replaceAll("‘", " "))
                .map(e->e.replaceAll("’s", " "))
                .map(e->e.split(" "))
                .flatMap(e-> Stream.of(e))
                .filter(e->!e.isEmpty())
                .collect(Collectors.toList());


    }

}
