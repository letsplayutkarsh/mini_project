package com.example;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Square root function");
            System.out.println("2. Factorial function");
            System.out.println("3. Natural logarithm");
            System.out.println("4. Power function");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    double sqrtNum = sc.nextDouble();
                    System.out.println("The square root of " + sqrtNum + " is " + Math.sqrt(sqrtNum));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int factNum = sc.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= factNum; i++) {
                        factorial *= i;
                    }
                    System.out.println(factNum + "! = " + factorial);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double lnNum = sc.nextDouble();
                    System.out.println("The natural logarithm of " + lnNum + " is " + Math.log(lnNum));
                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = sc.nextDouble();
                    System.out.println(base + "^" + exponent + " = " + Math.pow(base, exponent));
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid choice.");
                    break;
            }
        } while (choice != 5);
        sc.close();
    }
}


