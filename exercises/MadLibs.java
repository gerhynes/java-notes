package chapter2;

import java.util.Scanner;

public class MadLibs {
    public static void main(String[] arg){
        // Ask for an adjective
        System.out.println("Enter an adjective: ");
        Scanner scanner = new Scanner(System.in);
        String adjective = scanner.next();

        // Ask for a season of the year
        System.out.println("Enter a season of the year: ");
        String season = scanner.next();

        // Ask for a whole number
        System.out.println("Enter a whole number: ");
        int num = scanner.nextInt();
        scanner.close();

        // Print result
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + num + " cups of coffee.");
    }
}
