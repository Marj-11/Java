package week5.ex5;
import week5.ex4.Superhero;
import week5.ex4.SuperheroCaller;


public class AdvancedSuperheroApplication {
    public static void main(String[] args) {

        SuperheroCaller superheroCaller = new SuperheroCaller();
        Joker joker = new Joker();

        for (int times = 0; times < 10; times++) {

            //  joker.weaken(superheroCaller.call().getName());
            Superhero superhero = superheroCaller.call();
            joker.weaken(superhero.getName());
        }

    }
}
