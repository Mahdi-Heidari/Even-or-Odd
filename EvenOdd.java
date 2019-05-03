package evenodd;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter an integer number:\t");
        int num = reader.nextInt();

        if (num % 2 == 0) {

            System.out.printf("\n%d is even!", num);

        } else {

            System.out.printf("\n%d is odd!", num);
        }

        System.out.println("\n");
    }

}
