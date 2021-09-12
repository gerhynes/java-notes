package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {

    public static void main(String[] args){

        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Your goal is to enter enough change to make exactly $1.00");

        System.out.println("Enter your number of pennies:");
        int numOfPennies = scanner.nextInt();

        System.out.println("Enter your number of nickels:");
        int numOfNickels = scanner.nextInt();

        System.out.println("Enter your number of dimes:");
        int numOfDimes = scanner.nextInt();

        System.out.println("Enter your number of quarters:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;

        if(total < dollar){
            double amountUnder = dollar - total;

            // Limit to only 2 decimal places
            System.out.println("Sorry, you lose! You were $" + String.format("%.2f", amountUnder) + " under.");
        }
        else if(total > dollar){
            double amountOver = total - dollar;

            // Limit to only 2 decimal places
            System.out.println("Sorry, you lose! You were $" + String.format("%.2f", amountOver) + " over.");
        }
        else{
            System.out.println("Congratulations, that's exactly $1.00. You win!");
        }
    }
}
