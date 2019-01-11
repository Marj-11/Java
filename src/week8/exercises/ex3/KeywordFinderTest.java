package week8.exercises.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class KeywordFinderTest {

    KeywordFinder keywordFinder = new KeywordFinder();

    @Test
    void findElegant() {

        String newSentence = "The elephant is lifted eleven floors easily with the help of an electricity elevator";
        List<String> result = keywordFinder.findElegant(newSentence);
        List<String> expected = Arrays.asList("elephant", "eleven", "electricity", "elevator");
        Assertions.assertEquals(expected,result);

    }

    @Test
    void findPlayful() {

        String newSentence = "The rightful heir of the powerful king had an awful accident playing with a colorful bear";
        List<String> result = keywordFinder.findPlayful(newSentence);
        List<String> expected = Arrays.asList("rightful", "powerful", "awful", "colorful");
        Assertions.assertEquals(expected,result);
    }
}