package week5.ex4;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class SuperheroCaller {

   private List<Superhero> superheros = Arrays.asList(new Batman(), new Superman(), new Spiderman());
   private Random random = new Random();

   public Superhero call(){
       Integer position = random.nextInt(superheros.size());
       Superhero superhero = superheros.get(position);
       return superhero;
   }

}
