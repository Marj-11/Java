package week7.ex1;

import java.util.List;

public class MoneyApplication {
    public static void main(String[] args) {

        MoneyCollector moneyCollector = new MoneyCollector();
        List<Integer> list2 = moneyCollector.getList();
        System.out.println(list2);

        MoneyCalculator moneyCalculator = new MoneyCalculator();
        Integer total = moneyCalculator.calculateTotal(list2);
        System.out.println(total);


    }




}
