package week5.ex4;

import java.util.ArrayList;
import java.util.List;

public class SuperheroApplication {

    public static void main(String[] args) {

        SuperheroCaller superheroCaller = new SuperheroCaller();
        Superhero superhero = superheroCaller.call();
        System.out.println("Superhero:" + superhero);

        List<Superhero> superheros = new ArrayList<>();

        for (int i = 1; i < 7; i++) {
            Superhero superhero1 = superheroCaller.call();
            superheros.add(superhero1);
            System.out.println("Superheros " + i + ": " + superhero1);
        }
        System.out.println("Number of superheros: " + superheros.size());
    }
}
