package week4.reflection;

import week4.ex9.FileReader;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RobodogApplication {

    public static void main(String[] args) {

        FileReader fileReader = new FileReader();
        readInstruction(fileReader);

    }

    private static void readInstruction(FileReader reader) {
        System.out.println("---- INSTRUCTION");
        List<String> lines = reader.getLines("week4/reflection/robodog.txt");
        for (String line : lines) {

            System.out.println(line.replaceAll("!", ""));

        }

        Set<String> line = new HashSet<>();

        System.out.println("Number of unique instructions: " + lines.size());
    }

}










