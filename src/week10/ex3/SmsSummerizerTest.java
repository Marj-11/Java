package week10.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

class SmsSummerizerTest {
    private SmsSummerizer summerizer = new SmsSummerizer();
    private SmsReader reader = new SmsReader();
    private List<Sms> sms = reader.getSms("week10/ex3/sms.csv");

    @Test
    void getMostUsedLetter() {
        String actual = summerizer.getMostUsedLetter(sms);
        String expected = "e";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getLongestSpamMessage() {
        Optional<Integer> actual = summerizer.getLongestSpamMessage(sms);
        Optional<Integer> expected = Optional.of(224);

        Assertions.assertTrue(actual.isPresent());
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void getMostAppearingWord() {

        String actual = summerizer.getMostAppearingWord(sms);
        String expected = "to";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getRatioByHighestFirst() {
        String actual = summerizer.getRatioByHighestFirst(sms);
        String expected = "ham 86% spam 13% ";
        Assertions.assertEquals(expected, actual);
    }
}