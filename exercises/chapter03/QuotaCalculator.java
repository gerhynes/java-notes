package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args) {
        // Initialize known values
        int quota = 10;

        // Get unknown values
        System.out.println("Enter the number of sales you made this week.");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Make decision and output results
        if(sales >= quota){
            System.out.println("Congratulations, you've met your quota.");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not make your quota. You were " + salesShort + " sales short.");
        }
    }
}
