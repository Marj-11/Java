package week10.ex3;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SmsSummerizer {

    public void main() {

        SmsReader reader = new SmsReader();

        List<Sms> sms = reader.getSms("week10/ex3/sms.csv");
        getRatioByHighestFirst(sms);
        getMostAppearingWord(sms);
        getLongestSpamMessage(sms);
        getMostUsedLetter(sms);
    }

    public Optional<Integer> getLongestSpamMessage(List<Sms> sms) {
        return sms.stream()
                .filter(e -> e.getV1().equalsIgnoreCase("spam"))
                .map(Sms::getV2)
                .collect(Collectors.groupingBy(String::length, Collectors.toList()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getKey().compareTo(e1.getKey()))
                .limit(1)
                .map(e -> e.getValue().get(0).length())
                .findFirst();


    }

    public String getMostUsedLetter(List<Sms> sms) {
        String mostUsedLetter = sms.stream()
                .filter(e -> e.getV1().equalsIgnoreCase("ham"))
                .map(e -> e.getV2().replaceAll(" ", ""))
                .map(e -> e.split(""))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(e -> e.getKey())
                .collect(Collectors.joining());
        System.out.println("The most used letter is: " + mostUsedLetter);

        return mostUsedLetter;
    }

    public String getMostAppearingWord(List<Sms> sms) {
        String mostAppearingWord = sms.stream()
                .filter(e -> e.getV1().equalsIgnoreCase("ham"))
                .map(e -> e.getV2().split(" "))
                .flatMap(e -> Stream.of(e))
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .limit(1)
                .map(e -> e.getKey())
                .collect(Collectors.joining());

        System.out.println("The most appearing word is: " + mostAppearingWord);
        return mostAppearingWord;
    }

    public String getRatioByHighestFirst(List<Sms> sms) {
        String ratioHighestFirst = sms.stream()
                .collect(Collectors.groupingBy(e -> e.getV1(), Collectors.counting()))
                .entrySet().stream()
                .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                .map(e -> (e.getKey() + " " + e.getValue() * 100 / sms.size() + "% "))
                .collect(Collectors.joining());
        return ratioHighestFirst;
    }
}

