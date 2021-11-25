import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        // Initialize scanner object
        Scanner scanner = new Scanner(System.in);

        // Take in integer n
        System.out.println("Enter a number (n) to calculate the Fibonacci sequence to the nth number:");
        int n = scanner.nextInt();

        // Print Fibonacci sequence to nth number
        System.out.println("Fibonacci sequence up to " + n + "th number without recursion or functions");
        for(int i = 0; i < n; i++){
            System.out.print(iterativeFibonacci(i) + " ");
        }

        // Print line to separate results
        System.out.println();

        // Print Fibonacci sequence to nth number
        System.out.println("Fibonacci sequence up to " + n + "th number using recursion");
        for(int i = 0; i < n; i++){
            System.out.print(recursiveFibonacci(i) + " ");
        }

        // Close scanner to prevent memory leak
        scanner.close();
    }

    // Calculate nth number in Fibonacci sequence without recursion
    public static int iterativeFibonacci(int n){
        // Each number in the sequence is the sum of the previous two numbers
        int first = 0; // 1st number in Fibonacci sequence is 0
        int second = 1; // 2nd number in Fibonacci sequence is 1
        for (int i = 0; i < n; ++i) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return first;
    }

    // Calculate nth number in Ficonacci sequence using recursion
    public static int recursiveFibonacci(int n){
        if(n == 0){
            return 0; // 1st number in Fibonacci sequence is 0
        } else if (n == 1){
            return 1; // 2nd number in Fibonacci sequence is 1
        } else {
            // Recursively call the function for the 2 numbers immediately lower than n
            // For example, recursiveFibonacci(5) = recursiveFibonacci(3) + recursiveFibonacci(4)
            return recursiveFibonacci(n-2) + recursiveFibonacci(n-1);
        }
    }
}