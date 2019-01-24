package week10.ex3;

import week9.ex2.FileReader;

import java.util.List;
import java.util.stream.Collectors;

public class SmsReader {


    private FileReader reader = new FileReader();

    public List<Sms> getSms(String filepath) {
        return reader.asStream(filepath)
                .skip(1)
                .map(e -> e.split(";"))
                .map(column-> new Sms(column[0], column[1]))
                .collect(Collectors.toList());


    }
}