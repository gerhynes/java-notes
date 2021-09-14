package chapter4;

import java.util.Random;

public class RollTheDieGame {
    public static void main(String[] args) {
        int totalSpaces = 20;
        int maxRolls = 5;
        int currentSpace = 0;
        Random random = new Random();

        System.out.println("Welcome to 'Roll the Die'. You have 5 rolls to get to space 20.");
        System.out.println();
        for (int i = 1; i <= maxRolls; i++) {
            // Generate random number between 1 and 6
            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;
            System.out.println("Roll #" + i + ": You rolled a " + die + ".");

            if (currentSpace == totalSpaces){
                System.out.println("Congratulations. You landed on space " + totalSpaces);
                break;
            } else if (currentSpace > totalSpaces) {
                System.out.println("Sorry, you went past space" + totalSpaces + ". You lose.");
                break;
            }
            else if(i == maxRolls && currentSpace < totalSpaces) {
                System.out.println("You are on space " + currentSpace + ". Unfortunately, you didn't make it to space " + totalSpaces);
            }
             else {
                 int spacesLeft = totalSpaces - currentSpace;
                System.out.println("You're on space " + currentSpace + " and have " + spacesLeft + " more to go.");
            }
             System.out.println();
        }
    }
}
