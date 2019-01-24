package week9.week9Reflection;

import java.util.List;
import java.util.stream.Collectors;

public class StudentSummarizer {

    public void displayNumberOfBoysAndGirls(List<String> entries) {
        long females = entries.stream()
                .map(e->e.split(";"))
                .filter(e->e[0].contains("female"))
                .count();
        long males = entries.size()-females;
        System.out.println("Number of female students: " + females);
        System.out.println("Number of female students: " + males);

    }

    public void displayEducationLevels(List<String> entries) {
        List<String> educationLevels = entries.stream()
                .map(e->e.split(";"))
                .map(e-> e[1])
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Parental education levels sorted alphabetically:");
        System.out.println(educationLevels);
    }

    public void displayNumberOfStudentWithHigherThan90(List<String> entries) {
        int topScore = 90;
        long topStudent = entries.stream()
                .map(e->e.split(";"))
                .filter(e-> Integer.valueOf(e[2]) > topScore)
                .filter(e-> Integer.valueOf(e[3]) > topScore)
                .filter(e-> Integer.valueOf(e[4]) > topScore)
                .count();
        System.out.println("NumberOfStudentWithHigherThan90: " + topStudent);
    }




    public void displayNumberOfStudentEqualTo100(List<String> entries) {
        int topScore = 100;
        List<String> topStudent = entries.stream()
                .map(e->e.split(";"))
                .filter(e-> Integer.valueOf(e[2]) == topScore)
                .filter(e-> Integer.valueOf(e[3]) == topScore)
                .filter(e-> Integer.valueOf(e[4]) == topScore)
                .map(e->e[0])
                .collect(Collectors.toList());
        System.out.println("NumberOfStudentEqualTo100: " + topStudent.size());
        System.out.println("Genders: " + topStudent);
    }

}
