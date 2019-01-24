package week9.week9Reflection;

import week9.ex2.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {

    List<String> getEntries() {
        FileReader reader = new FileReader();
        return reader.asStream("week9/week9Reflection/students-performance.csv")
                .skip(1)
                .collect(Collectors.toList());
    }

}
