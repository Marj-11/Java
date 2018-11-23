package Package.Week2;

import java.util.Scanner;


public class CalculatorMagnet {

    public static void main(String[] args) {
        Integer number1 = getNumber();
        Integer number2 = getNumber();
        Integer sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }

    public static Integer getNumber() {
        System.out.println("Tell me one number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
