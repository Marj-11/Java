package week6.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


public class CoffeeMakers {

    private static List<CoffeeMaker> coffeeMakers = Arrays.asList(new FrenchPress(), new AutoDrip(), new AutomaticCoffeeMachine());
    public static List<CoffeeMaker> asList(){

   return coffeeMakers;
    }

public static Optional<CoffeeMaker> get(String name){
    for (CoffeeMaker coffeeMaker : coffeeMakers) {
        if(coffeeMaker.getName().equalsIgnoreCase(name)){
            return Optional.of(coffeeMaker);
        }
    }
    return Optional.empty();
    }

}
