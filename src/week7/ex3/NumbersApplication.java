package week7.ex3;

import java.util.ArrayList;
import java.util.List;

public class NumbersApplication {

    public static void main(String[] args) {

        Numbers numbers = new Numbers();

        List<Integer> list = numbers.list2();

        List<Integer> smallAndBig = new ArrayList<>();

        smallAndBig.add(list.get(0));
        smallAndBig.add(list.get(list.size() - 1));

        System.out.println(list);
        System.out.println(smallAndBig);



    }

}
