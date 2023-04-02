package com.example;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
import java.lang.Math;
// import org.apache.logging.log4j.LogManager;
// import org.apache.logging.log4j.Logger;

public class App {
    // private static Logger logger;
    public static void main(String[] args) {

        // logger = LogManager.getLogger(App.class);

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            // hello world
            System.out.println("New Menu");
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
                    // logger.info("result of square root of " + sqrtNum + " is: " + Math.sqrt(sqrtNum));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int factNum = sc.nextInt();
                    int factorial = 1;
                    for (int i = 1; i <= factNum; i++) {
                        factorial *= i;
                    }
                    System.out.println(factNum + "! = " + factorial);
                    // logger.info("result of factorial of " + factNum + " is: " + factorial);
                    break;
                case 3:
                    System.out.print("Enter a number: ");
                    double lnNum = sc.nextDouble();
                    System.out.println("The natural logarithm of " + lnNum + " is " + Math.log(lnNum));
                    // logger.info("result of natural logarithm of " + lnNum + " is: " + Math.log(lnNum));

                    break;
                case 4:
                    System.out.print("Enter a number: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter the exponent: ");
                    double exponent = sc.nextDouble();
                    System.out.println(base + "^" + exponent + " = " + Math.pow(base, exponent));
                    // logger.info("result of exponent " + base + "^" + exponent + " is: " + Math.pow(base, exponent));

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


