import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("Enter first integer: ");
            a = input.nextInt();
            System.out.print("Enter second integer: ");
            b = input.nextInt();
            if (a <= 0 || b <= 0) {
                System.out.println("both integer must be positive. Try again.");
            }
        } while (a <= 0 || b <= 0);

        int smaller = Math.min(a, b);
        int gcd = 1;
        int iterations = 0;

        for (int k = 1; k <= smaller; k++) {
            iterations++;
            if (a % k == 0 && b % k == 0) {
                gcd = k;
            }
        }

        System.out.println("The gcd of " + a + " and " + b + " is " + gcd);
        System.out.println("Loop iterations: " + iterations);

        input.close();
    }
}