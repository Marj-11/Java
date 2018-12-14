package week6.ex4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GreedyAlgorithm {

    public List<Money> change (Integer amount){
        List<Money> change = new ArrayList<>();
        List<Money> monies = getMonies();

        while(amount > 0.0){
            Money money = monies.get(0);
            if(money.isApplicable(amount)){
                change.add(money);
                amount -= money.getAmount();
            }else{
                Collections.rotate(monies, -1);
            }
        }

        return change;
    }

    private List<Money> getMonies(){
        return new ArrayList<>(Arrays.asList(new Cent50(), new Cent20(), new Cent10(), new Cent5(),
                new Cent2(), new Cent1()));

    }

}


