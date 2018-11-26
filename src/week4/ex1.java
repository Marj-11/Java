package week4;

import java.util.ArrayList;
import java.util.List;

public class ex1 {

    public static void main(String[] args) {



        List<String> groceries = new ArrayList<>();

        System.out.println("Groceries: " + groceries);

        groceries.add("banana");
        groceries.add("apple");
        groceries.add("orange");

        System.out.println("Groceries: " + groceries);

        groceries.remove("banana");

        System.out.println("Groceries: " + groceries);

        groceries.add("orange");
        groceries.add("orange");

        System.out.println("Groceries: " + groceries);

        groceries.remove("orange");
        System.out.println("Groceries: " + groceries);

        System.out.println("Groceries size is : " + groceries.size());



    }
}
