package week7.ex5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Palindrom {

    public String word = "madam";

    public String  word2() {

        String[] splittedWord = word.split("");

        List<String> listo = Arrays.asList(splittedWord);
        Collections.reverse(listo);

        return String.join("", listo) ;


    }
}