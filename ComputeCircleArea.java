import java.util.Scanner;
public class ComputeCircleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double jari_jari, luas;

        System.out.print("Masukkan nilai jari_jari nya = ");
        jari_jari = input.nextDouble();
        luas = Math.PI * jari_jari * jari_jari;
        System.out.println("luas lingakaran dengan jari-jari "+jari_jari+" adalah "+luas);

        input.close();
    }
}
