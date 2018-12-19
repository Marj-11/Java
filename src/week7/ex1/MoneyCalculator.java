package week7.ex1;

import java.util.List;

public class MoneyCalculator {

    public Integer calculateTotal(List<Integer> list2) {

        Integer total = 0;
        for (Integer value : list2) {
            total += value;


        }
        return total;
    }
}
