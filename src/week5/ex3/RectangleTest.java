package week5.ex3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle rectangle = new Rectangle();



    @Test
    void asRectangle() {
        Assertions.assertEquals("Rectangle", rectangle.getName(),"Wrong!");

    }

    @Test
    void asShape() {
        String shape = rectangle.getName();
        Assertions.assertEquals("Rectangle",shape,"Wrong!");
    }
    @Test
    void asColored() {

        Assertions.assertEquals("Green",rectangle.getColor(),"Wrong!");
    }


}