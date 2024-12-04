package calc;

import java.util.Scanner;

public class Calculator {

    // פונקציה לחיבור
    public static double add(double a, double b) {
        return a + b;
    }

    // פונקציה לחיסור
    public static double subtract(double a, double b) {
        return a - b;
    }

    // פונקציה לכפל
    public static double multiply(double a, double b) {
        return a * b;
    }

    // פונקציה לחילוק
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!");
        System.out.println("Choose an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = 0;
        boolean validChoice = true;
        try {
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    break;
                case 4:
                    result = divide(num1, num2);
                    break;
                default:
                    validChoice = false;
                    System.out.println("Invalid choice! Please choose a valid operation.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            validChoice = false;
        }
        if (validChoice) {
            System.out.println("The result is: " + result);
        }
        scanner.close();
    }
}
