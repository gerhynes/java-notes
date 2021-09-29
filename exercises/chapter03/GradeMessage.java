package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        // Get letter grade
        System.out.println("Enter your letter grade:");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        // Generate appropriate message
        String message;

        switch(grade){
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "F":
                message = "We need to talk.";
                break;
            default:
                message = "Error, invalid grade.";
                break;
        }
        System.out.println(message);
    }
}
