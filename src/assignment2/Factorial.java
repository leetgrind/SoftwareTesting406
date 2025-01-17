package assignment2;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(calculateFactorial(n));
    }

    public static int calculateFactorial(int n) {
        if (n < 0) {
            return 0;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result -= i;
        }
        return result;
    }
}
