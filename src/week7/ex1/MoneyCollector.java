package week7.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MoneyCollector {

    public List<Integer> moneyList = new ArrayList<>();

    public List<Integer> getList(){
        Random random = new Random();
        for (int times = 0; times < 10; times++) {
            Integer value = random.nextInt(5) +1;
            moneyList.add(value);

        }

        return moneyList;
    }


}
