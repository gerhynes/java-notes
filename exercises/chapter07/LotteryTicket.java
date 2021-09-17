package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){
        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i = 0; i < LENGTH; i++){
            int randomNum;
            // Generate random number and check if it's already in array
            do{
                randomNum = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while(search(ticket, randomNum));
            ticket[i] = randomNum;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor){
        for(int value : array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        // If entire array was searched and value not found
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor){
        // Array must be sorted
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);
        if(index >= 0){
            return true;
        } else {
            return false;
        }
    }

    public static void printTicket(int ticket[]){
        for(int i=0; i < LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}
