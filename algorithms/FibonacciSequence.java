import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        // nth number to calculate Fibonacci sequence to
//        int n = 12;

        System.out.println("Enter a number (n) to calculate the Fibonacci sequence to the nth number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println("Fibonacci sequence up to " + n + "th number without recursion or functions");
        for(int i = 0; i < n; i++){
            System.out.print(iterativeFibonacci(i) + " ");
        }

        System.out.println("Fibonacci sequence up to " + n + "th number using recursion");
        for(int i = 0; i < n; i++){
            System.out.print(recursiveFibonacci(i) + " ");
            // Print newline character after printing sequence
            if(i == n-1) System.out.printf("%n");
        }
    }

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

    public static int recursiveFibonacci(int n){
        if(n == 0){ // First number in Fibonacci sequence is 0
            return 0;
        } else if (n == 1 || n == 2){ // 2nd and 3rd number in sequence are 1 and 1
            return 1;
        } else {
            // Recursively call the function
            return recursiveFibonacci(n-2) + recursiveFibonacci(n-1);
        }
    }
}
