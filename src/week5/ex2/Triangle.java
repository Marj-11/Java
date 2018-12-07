package week5.ex2;

import week5.ex1.Shape;

public class Triangle implements Shape {
    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public String toString() {
        return getName();
    }
}
