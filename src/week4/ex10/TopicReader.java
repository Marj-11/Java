package week4.ex10;

import week4.ex7.Topic;
import week4.ex9.FileReader;

import java.util.ArrayList;
import java.util.List;

public class TopicReader {

    private FileReader reader = new FileReader();

    public List<Topic> asList() {
        List<String> lines = readAllLines();
        List<Topic> topics = parseTopics(lines);
        return topics;
    }

    private List<String> readAllLines() {
        String filePath = "week4/ex10/topics.txt";
        return reader.getLines(filePath);
    }

    private List<Topic> parseTopics(List<String> lines) {
        List<Topic> topics = new ArrayList<>();
        for (String line : lines) {
            topics.add(new Topic(line));
        }
        return topics;
    }

}