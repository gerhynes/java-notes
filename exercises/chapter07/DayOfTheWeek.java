package chapter7;

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number for the day of the week");
        int index = scanner.nextInt();
        scanner.close();

        System.out.println("The corresponding day is: " + week[index - 1]);
    }
}
