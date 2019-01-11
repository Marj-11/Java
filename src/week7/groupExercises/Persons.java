package week7.groupExercises;

import week4.ex9.FileReader;

import java.util.ArrayList;
import java.util.List;


public class Persons {

    FileReader fileReader = new FileReader();

    public void readDocument(FileReader reader) {
        List<String> lines = reader.getLines("week7/groupExercises/Untitled Document");
        for (String line : lines) {
            String[] splittedWord = line.split(";");
            List<String[]> list1 = new ArrayList<>();
            list1.add(splittedWord);
        }
    }

}

