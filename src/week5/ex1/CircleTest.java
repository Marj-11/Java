package week5.ex1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle circle = new Circle();
    Circle anotherShape = new Circle();

    @Test
    void getName() {
        Assertions.assertEquals(circle,circle, "Not equals");
    }
    @Test
    void getName1() {
        Assertions.assertEquals(circle,anotherShape, "Not equals");
    }
}