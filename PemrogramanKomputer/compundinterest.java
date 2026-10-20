import java.util.Scanner;
public class compundinterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double principal;
        double annualRate;

        do {
            System.out.print("Enter initial amount: ");
            principal = input.nextDouble();
            if (principal <= 0) {
                System.out.println("Initial amount must be positive.");
            }
        } while (principal <= 0);

        do {
            System.out.print("Enter annual interest rate (%): ");
            annualRate = input.nextDouble();
            if (annualRate < 0) {
                System.out.println("Interest rate must not be negative.");
            }
        } while (annualRate < 0);

        double balance = principal;

        System.out.printf("%n%-6s%18s%18s%n", "Year", "Interest", "Balance");
        for (int year = 1; year <= 10; year++) {
            double interest = balance * annualRate / 100;
            balance += interest;
            System.out.printf("%-6d%18.2f%18.2f%n", year, interest, balance);
        }
        System.out.printf("Total growth after 10 years: %.2f%n", balance - principal);

        input.close();
    }
}   
