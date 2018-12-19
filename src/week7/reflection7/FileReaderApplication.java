package week7.reflection7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReaderApplication {
    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        readDocument(fileReader);

    }

    private static void readDocument(week4.ex9.FileReader reader) {
        System.out.println("---- DOCUMENT");
        List<String> lines = reader.getLines("week7/reflection7/Untitled Document");
        for (String line : lines) {
            String[] splittedWord = line.split(";");
            List<String> list1 = Arrays.asList(splittedWord);
            System.out.println(list1);

        }
    }
}
