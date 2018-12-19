package week7.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class NameTest {

    private Name name = new Name();


    @Test
    void nickName() {

        String test = name.nickName("metallica");
        Assertions.assertEquals("meta",test);
    }
}