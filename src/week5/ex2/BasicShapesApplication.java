package week5.ex2;


import week5.ex1.Circle;
import week5.ex1.Shape;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicShapesApplication {

    public static void main(String[] args) {


        Shape circle = new Circle();
        System.out.println("Shape: " + circle.getName());
        Shape square = new Square();
        System.out.println("Shape: " + square.getName());
        Shape triangle = new Triangle();
        System.out.println("Shape: " + triangle.getName());

        List<Shape> shapes = Arrays.asList(circle, square,triangle);

        System.out.println("Shapes: " + shapes);
        for (Shape shape : shapes){
            System.out.println(shape.getName());
        }
    }


}
