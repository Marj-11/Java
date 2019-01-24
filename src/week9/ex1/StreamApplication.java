package week9.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApplication {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        for (int times = 1; times <21 ; times++) {
            numbers.add(times);
        }
        List<Integer> even = numbers.stream()
                .filter(e -> e % 2 ==0)
                .collect(Collectors.toList());
        System.out.println("Even numbers: ");
        System.out.println(even);

        List<Integer> odd = numbers.stream()
                .filter(e -> e % 2 !=0)
                .collect(Collectors.toList());
        System.out.println("Odd numbers: ");
        System.out.println(odd);

        List<Integer> divisibleBy3 = numbers.stream()
                .filter(e -> e % 3 ==0 && e > 10)
                .collect(Collectors.toList());
        System.out.println("Numbers divisible by 3 and bigger than 10: ");
        System.out.println(divisibleBy3);

        List<Integer> smallerthan5 = numbers.stream()
                .filter(e -> e < 5)
                .map(e -> e * 3)
                .collect(Collectors.toList());

        System.out.println("Numbers smaller than 5 and multiplied by 3: ");
        System.out.println(smallerthan5);

        List<String> digits = numbers.stream()
                .filter(e -> e > 8 && e <12)
                .map(e -> "number " + e + " has " + e.toString().length() + " digits ")
                .collect(Collectors.toList());
        System.out.println(digits);



    }





}