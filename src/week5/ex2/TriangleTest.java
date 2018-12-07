package week5.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {

    Triangle triangle = new Triangle();

    @Test
    void triangleTest() {

        String shape = triangle.getName();
        Assertions.assertEquals("Triangle",shape,"wrong!");

    }
}