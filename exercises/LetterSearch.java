package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String[] args) {
        // Get text
        System.out.println("Enter some text:");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        // Search the text for the letter A
        for(int i = 0; i < text.length(); i++){
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text contains the letter A/a");
        } else {
            System.out.println("This text doesn't contain the letter A/a");
        }
    }
}
