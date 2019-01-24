package week9.week9Reflection;

import java.util.List;

public class StudentApp {

    public static void main(String[] args) {

        StudentReader reader = new StudentReader();
        List<String> entries = reader.getEntries();
        System.out.println("Total number of studentSummarizer performance entries: " + entries.size());

        StudentSummarizer studentSummarizer = new StudentSummarizer();

        studentSummarizer.displayNumberOfBoysAndGirls(entries);
        studentSummarizer.displayEducationLevels(entries);
        studentSummarizer.displayNumberOfStudentWithHigherThan90(entries);
        studentSummarizer.displayNumberOfStudentEqualTo100(entries);
    }

}
