package reflection;


import java.util.Scanner;

public class NumberMirrorApplication {


    public static void main(String[] args) {

            NumberMirror numberMirror = new NumberMirror();

            System.out.print("Write a number: ");
            Scanner scanner = new Scanner(System.in);
            Integer number = scanner.nextInt();
            Integer mirrored = numberMirror.mirror(number);
            System.out.println("Original: " + number);
            System.out.println("Mirrored: " + mirrored);

        }
    }
