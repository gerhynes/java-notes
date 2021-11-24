import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("Enter a number (n) to calculate the Fibonacci sequence to the nth number");
        Scanner scanner = new Scanner(System.in);
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
        int prev = 0;
        int next = 1;
        for (int i = 0; i < n; ++i) {
            int sum = prev + next;
            prev = next;
            next = sum;
        }
        return prev;
    }

    // Calculate nth number in Ficonacci sequence using recursion
    public static int recursiveFibonacci(int n){
        if(n == 0){
            return 0; // 1st number in Fibonacci sequence is 0
        } else if (n <= 2){
            return 1; // 2nd and 3rd number in sequence are 1 and 1
        } else {
            // Recursively call the function
            return recursiveFibonacci(n-2) + recursiveFibonacci(n-1);
        }
    }
}
