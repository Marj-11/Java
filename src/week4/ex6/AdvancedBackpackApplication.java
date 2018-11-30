package week4.ex6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdvancedBackpackApplication {

    public static void main(String[] args) {

        Set<Item> items = new HashSet<>();
        System.out.println("Backpack: " + items);

        Item toothpaste = new Item("toothpaste");
        Item towel = new Item("towel");
        Item underwear = new Item("underwear");


        items.add(toothpaste);
        items.add(towel);
        items.add(underwear);
        System.out.println("Backpack: " + items);

        Item newUnderwear = new Item("underwear");

        Boolean isExist = items.contains(newUnderwear);
        if(isExist){
            System.out.println("The backpack contains underwear");
        }

        items.remove(newUnderwear);
        System.out.println("Backpack: " + items);
        if(isExist){
            System.out.println("The backpack no longer contains underwear");
        }

        items.add(towel);
        items.add(towel);

        System.out.println("Backpack: " + items);

        System.out.println("Backpack size: " + items.size());





    }
}
