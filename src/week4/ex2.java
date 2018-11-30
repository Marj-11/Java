package week4;

import java.util.HashSet;
import java.util.Set;

public class ex2 {
    public static void main(String[] args) {

        Set<String> backpack = new HashSet<>();

        System.out.println("Backpack: " +backpack);

        backpack.add("toothpaste");
        backpack.add("towel");
        backpack.add("underwear");

        System.out.println("Backpack: " + backpack);

        boolean containsUnderWear = backpack.contains("underwear");

        if(containsUnderWear) {
            System.out.println("The Backpack contains underwear");
        }
        backpack.remove("underwear");
        System.out.println("Backpack: " + backpack);

        if(containsUnderWear){
            System.out.println("The backpack no longer contains underwear");
        }
        System.out.println("Backpack: " + backpack);
        System.out.println("Backpack: " + backpack);

        System.out.println("The backpack size is: " + backpack.size());





    }

}
