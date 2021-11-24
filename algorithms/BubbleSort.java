import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        // Set desired length of array
        int arrLength = 10;

        // Initialize array
        int[] arr = new int[arrLength];

        // Initialize scanner object
        Scanner scanner = new Scanner(System.in);

        // Take in numbers from user and populate array
        System.out.println("Enter " + arrLength + " numbers to populate an array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }

        // Loop over and print unsorted array
        System.out.println("Unsorted array: ");
        printArray(arr);

        // Loop over the array from right to left
        // Start at the second last index to avoid ArrayIndexOutOfBounds exception
        for (int i = arr.length -1; i > 0; i--) {
            // For every iteration of the outer loop, loop over the array
            for (int j = 0; j < arr.length - 1; j++) {
                // Compare the number at the current index with the number at the next index
                if (arr[j] > arr[j + 1]) {
                    // If the current number is larger, save it to a temporary variable
                    int temp = arr[j];
                    // Save the next number's value into the current index
                    arr[j] = arr[j + 1];
                    // Now save the current number's value into the next index
                    // Causing larger numbers to bubble upwards to the right
                    arr[j + 1] = temp;
                }
            }
        }

        // Loop over and print sorted array
        System.out.println("Sorted array: ");
        printArray(arr);

        // Close scanner to prevent memory leak
        scanner.close();
    }

    static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // Print blank line to separate arrays
        System.out.println();
    }
}
