package chapter3;

import java.util.Scanner;

/*
All salespeople get $1,000 a week.
Those who exceed 10 sales get a $250 bonus.
*/

public class SalaryCalculator {
    public static void main(String[] args) {
        // Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Get sales figures
        System.out.println(("How many sales did the employee make this week?"));
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Calculate for bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }

        // Output
        System.out.println("The employee's pay is $" + salary);
    }
}
