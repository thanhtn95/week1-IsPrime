import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A number to check: ");
        int input = sc.nextInt();
        if (isPrime(input)) {
            System.out.println(input + " is a prime number!");
        } else System.out.println(input + " isn't a prime number!");
    }

    private static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(a); i++) {
                if (a % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
