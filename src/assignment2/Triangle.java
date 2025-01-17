package assignment2;

import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        printTriangle(n);
    }


    /*
     * The expected output of this program should look like
     *
     * For n=5 for example
     *
     *     *
          ***
         *****
        *******
       *********
     *
     * However the program contains some bugs. Debug and fix the program.
     * To run create a project and change the name of "ChangeToMain" method to Main
     *
     */

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int spaces = n - i - 1;
            for(int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
