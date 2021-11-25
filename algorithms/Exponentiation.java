import java.util.Scanner;

public class Exponentiation {
    public static void main(String[] args) {
        // Initialize variables
        int x;
        int n;

        // Initialize scanner object
        Scanner scanner = new Scanner(System.in);

        // Take in base number
        System.out.println("Enter a number to exponentiate");
        x = scanner.nextInt();

        // Take in exponent
        System.out.println("Enter the power to raise it to");
        n = scanner.nextInt();

        // Print result of expBySquaring
        System.out.println(expBySquaring(x,n));

        // Close scanner to prevent memory leak
        scanner.close();
    }

    public static int expBySquaring(int x, int n){
        if (n < 0){
            return expBySquaring(1/x, -n);
        } else if (n == 0){
            return 1;
        } else if(n == 1){
            return x;
        } else if(n % 2 == 0) {
            return expBySquaring(x*x, n/2);
        } else {
            return x * expBySquaring(x*x, (n-1)/2);
        }
    }
}
