package week10.ex2;

import week9.ex2.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class StudentReader {

    private FileReader reader = new FileReader();

    public List<Student> getStudent(String filepath) {
        return reader.asStream(filepath)
                .skip(1)
                .map(e -> e.split(";"))
                .map(column -> new Student(column[0], column[1], Integer.valueOf(column[2]),
                        Integer.valueOf(column[3]), Integer.valueOf(column[4])))
                .collect(Collectors.toList());

    }
}