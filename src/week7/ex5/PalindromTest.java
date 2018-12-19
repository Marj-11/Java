package week7.ex5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PalindromTest {

    Palindrom palindrom = new Palindrom();


    @Test
    void word2() {

        String test = palindrom.word2();
        Assertions.assertEquals("madam", test);

    }
}