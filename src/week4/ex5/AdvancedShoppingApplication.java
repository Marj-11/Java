package week4.ex5;

import java.util.ArrayList;
import java.util.List;

public class AdvancedShoppingApplication {

    public static void main(String[] args) {

        List<Grocery> groceries = new ArrayList<>();

        System.out.println("Groceries: " + groceries);

        Grocery banana = new Grocery("banana");
        Grocery oranges = new Grocery("oranges");
        Grocery tomatoes = new Grocery("tomatoes");

        groceries.add(banana);
        groceries.add(oranges);
        groceries.add(tomatoes);


        System.out.println("Groceries: " + groceries);

        Grocery otherBanana = new Grocery("banana");
        groceries.remove(otherBanana);

        System.out.println("Groceries: " + groceries);

        Grocery mangoo = new Grocery("mangoo");


        groceries.add(mangoo);
        groceries.add(mangoo);
        System.out.println("Groceries: " + groceries);

        groceries.remove(2);
        System.out.println("Groceries: " + groceries);

        System.out.println("Groceries size: " + groceries.size());
    }
}
