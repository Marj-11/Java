package week6.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CoffeeMakerApplication {
    public static void main(String[] args) {

        List<CoffeeMaker> coffeeMakers = CoffeeMakers.asList();
        for (CoffeeMaker coffeeMaker : coffeeMakers) {
            Coffee coffee = coffeeMaker.brew();
            System.out.println(coffee.getMadeBy() + " brewed a Coffee and it took " +coffee.getBrewedTime() + " minutes" );
        }

        checkOne("French press");
        checkOne("Automatic coffee machine");
        checkOne("Auto drip");
        checkOne("Moka Pot");    }

        private static void checkOne(String name){

        Optional<CoffeeMaker> coffeeMakerOptional = CoffeeMakers.get(name);
        if(coffeeMakerOptional.isPresent()){
            coffeeMakerOptional.get().brew();
            System.out.println(coffeeMakerOptional.get().getName() + " brewed a Coffee and it took " + coffeeMakerOptional.get().getBrewingTime() + " minutes");
        }else
            System.out.println("The coffee maker with the Name " + name + " pot is not available");

    }
}

