package week5.ex2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square square = new Square();

    @Test
    void setSquare() {
        String shape = square.getName();
        Assertions.assertEquals("square",shape,"Wrong!");

    }
}