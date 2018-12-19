package week7.ex2;

import java.util.Scanner;

public class NickNameApplication {
    public static void main(String[] args) {

        Name name = new Name();

        System.out.println("Input Name: ");

        Scanner scanner = new Scanner(System.in);
        String scanny = scanner.nextLine();

        String result = name.nickName(scanny);

        System.out.println("The nickname is: " + result);


    }
}
