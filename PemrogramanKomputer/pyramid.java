import java.util.Scanner;
public class pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;

        do {
            System.out.print("Enter n: ");
            n = input.nextInt();
            if (n < 1 || n > 15) {
                System.out.println("n must be between 1 and 15.");
            }
        } while (n < 1 || n > 15);

        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.printf("%3s", "");
            }
            // 2) angka naik: 1 .. row
            for (int num = 1; num <= row; num++) {
                System.out.printf("%3d", num);
            }
            // 3) angka turun: row-1 .. 1
            for (int num = row - 1; num >= 1; num--) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }

        input.close();
    }
}
