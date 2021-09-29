package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set sentinel value
        boolean again;

        do {
            System.out.println("We're going to add two numbers.");
            System.out.println("Enter the first number");
            double num1 = scanner.nextDouble();

            System.out.println("Enter the second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("The sum is " + sum);

            System.out.println("Would you like to start over? Enter: true/false");
            again = scanner.nextBoolean();
        } while (again);

        scanner.close();
    }
}
