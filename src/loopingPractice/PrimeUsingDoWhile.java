package loopingPractice;

import java.util.*;

public class PrimeUsingDoWhile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int count = 0;
        int i = 1;

        if (num > 1) {

            do {
                if (num % i == 0) {
                    count++;
                }
                i++;

            } while (i <= num);

        }

        if (count == 2) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}