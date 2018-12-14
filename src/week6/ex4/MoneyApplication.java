package week6.ex4;

import java.util.List;
import java.util.Scanner;

public class MoneyApplication {
    public static void main(String[] args) {

        GreedyAlgorithm greedy = new GreedyAlgorithm();
        System.out.println("Input change: ");
        Scanner scanner = new Scanner(System.in);
        Integer scanny = scanner.nextInt();
        List<Money> change = greedy.change(scanny);
        System.out.println("List of change: " + change);
        System.out.println("List of change: " + change.size());



    }



}
