package week8.exercises.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class KeywordFinder {

    public List<String> findElegant(String sentence) {
        return finder(sentence, word -> word.startsWith("ele"));
    }

    public List<String> findPlayful(String sentence) {
        return finder(sentence, word -> word.endsWith("ful"));
    }



    public List<String> finder (String sentence, Predicate <String> condition){

        List<String> result = new ArrayList<>();
        List<String> splitedWords = Arrays.asList(sentence.split(" "));
        for (String splitedWord : splitedWords) {
            if(condition.test(splitedWord)){
                result.add(splitedWord);
            }

        }
        return result;
    }
}