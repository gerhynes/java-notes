import java.util.Scanner;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        System.out.println("Enter two numbers (a, b) to find their greatest common divisor");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(gcd(a,b));
    }

    static int gcd(int a, int b){
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
