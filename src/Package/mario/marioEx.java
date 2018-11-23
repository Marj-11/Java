package Package.mario;

import java.util.Scanner;

public class marioEx {
    public static void main(String[] args) {

        Integer height = getHeight();
        printPyramid(height);
    }

    private static void printPyramid(Integer height) {
        Integer column = 24;
        Integer printHashtags = 2;
        Integer space = column - printHashtags;
        for (int row = 1; row <= height; row++) {
            for (int spacenumber = 1; spacenumber <= space; spacenumber++) {
                System.out.print(' ');
            }
            for (int hashtagsnumber = 1; hashtagsnumber <= printHashtags; hashtagsnumber++) {
                System.out.print('#');
            }
            if (printHashtags < 25)
                printHashtags += 1;
            space = column - printHashtags;
            System.out.format("\n");
        }
    }

    private static Integer getHeight() {
        System.out.println("Height : ");
        Scanner scanner = new Scanner(System.in);
        Integer height = scanner.nextInt();
        while (!(height >= 0 && height < 24)) {
            System.out.println("Height : ");
            height = scanner.nextInt();
        }
        return height;
    }
}

