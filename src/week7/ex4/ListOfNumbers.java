package week7.ex4;

import java.util.Arrays;
import java.util.List;

public class ListOfNumbers {

    public Integer numbers = 17263;

    public  List<String> numbers2(){

        String stringNumber = numbers.toString();

        String[] splittedList = stringNumber.split("");


    return Arrays.asList(splittedList);
  }

}

