import java.util.Scanner;
public class ComputeAvarage {
    public static void main (String[] args){

        String d;
        int a, b, c;
        Scanner input = new Scanner(System.in);

        System.out.println("Average");
        System.out.println("---------------------------------------");
        System.out.println("Enter untuk lanjut");
        d = input.nextLine();

        System.out.print("Masukkan nilai a = ");
        a = input.nextInt();
        System.out.print("Masukkan nilai b = ");
        b = input.nextInt();
        System.out.print("Masukkan nilai c = ");
        c = input.nextInt();

        int average = (a+b+c) / 3;
        System.out.println("Rata-Rata nilai dari " + a + ", " + b + ", " + c + ", adalah " + average);

        input.close();
    }
}
