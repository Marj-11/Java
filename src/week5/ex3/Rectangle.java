package week5.ex3;

import week5.ex1.Shape;

public class Rectangle implements Colored, Shape {

    @Override
    public String getColor() {
        return "Green";
    }

    @Override
    public String getName() {
        return "Rectangle";
    }

    @Override
    public String toString() {
        return getColor() + getName();
    }
}
