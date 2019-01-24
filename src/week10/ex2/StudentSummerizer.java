package week10.ex2;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentSummerizer {
    public static void main(String[] args) {

        StudentReader reader = new StudentReader();
        List<Student> students = reader.getStudent("week10/ex2/students-performance.csv");

        getHowManyLevel(students);
        getTopToBottom(students);
        getNumberMaster(students);
        getAverage(students);
        getHighSchool(students);


    }

    private static void getHighSchool(List<Student> students) {
        boolean  highSchool = students.stream()
                .filter(e -> e.getParentalLevelOfEducation().equalsIgnoreCase("some high school"))
                .anyMatch(e -> (e.getWritingScore() >= 95 && e.getReadingScore() >= 95 && e.getMathScore() >= 95));
        System.out.println(highSchool);
    }

    private static void getAverage(List<Student> students) {
        List<String> average = students.stream()
                .map(e -> (e.getMathScore() + e.getReadingScore() + e.getWritingScore()) / 3 + " | " + e.getGender())
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .collect(Collectors.toList());
        System.out.println("Genders and average scores of the top four average score students: ");
        average.stream()
                .forEach(System.out::println);
    }


    private static void getHowManyLevel(List<Student> students) {
        System.out.println("Parent education level appearances: ");
        Map<String, Long> howManyLevel = students.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(howManyLevel);


    }

    private static void getTopToBottom(List<Student> students) {
        System.out.println("Parent education level appearances sorted top bottom:");
        List<String> topToBottom = students.stream()
                .map(e -> e.getParentalLevelOfEducation())
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> e.getKey() + " | " + e.getValue())
                .collect(Collectors.toList());
        topToBottom.forEach(System.out::println);
    }

    private static void getNumberMaster(List<Student> students) {

        long numberMaster = students.stream()
                .filter(e -> e.getParentalLevelOfEducation().equalsIgnoreCase("master's degree"))
                .filter(e -> e.getMathScore() < 60)
                .filter(e -> e.getReadingScore() < 60)
                .filter(e -> e.getWritingScore() < 60)
                .count();
        System.out.println("Number of students with high parent education and lower scores than 60: " + numberMaster);
    }


}
