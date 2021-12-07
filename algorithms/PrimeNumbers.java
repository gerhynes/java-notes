import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number (n) to get all prime numbers up to n");
        int n = scanner.nextInt();

       for(int i = 2; i <= n; i++){
           if(isPrime(i)){
               System.out.print(i + " ");
           }
       }
    }

    static boolean isPrime(int n){
        if(n < 1){
            return false;
        } else if (n == 1){
            return true;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
