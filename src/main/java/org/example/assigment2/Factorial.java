package org.example.assigment2;

import java.util.Scanner;

public class Factorial {

    /* The following program tries to calculate the factorial of a number.
     * But it contains some bugs. Fix the bugs using debugging
     *
     * A factorial of a non negative number is defined as
     * for n >0 n! = n*(n-1)*(n-2)....*3*2*1
     * for n=0 n! = 1
     * Example 5! = 5*4*3*2*1 = 120
     */

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
