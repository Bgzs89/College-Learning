
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

class Market {
    static void belanja() {

    int totawal, totakhir;
    String member, id;
    boolean valid = false;
    Scanner input = new Scanner(System.in);

    System.out.println("apakah anda ada kartu member? ");
    System.out.println("1.ya");
    System.out.println("2.tidak");
    System.out.println("3.Admin mode");
    System.out.print("pilih 1 atau 2 : ");
    member = input.nextLine();

    if(member.equals("3")){
        Cardread.cardread();
    }
    if(member.equals("1")){
        System.out.print("Masukkan ID MEMBER anda : ");
        id = input.nextLine();

        if(isValidMember(id)) {
            System.out.println("ID MEMBER valid.");
            valid = true;
            System.out.println("Selamat anda mendapatkan voucher diskon sebesar 20% untuk semua belanjaan anda");
            System.out.print("Masukkan total belanjaan anda : Rp.");
            totawal = input.nextInt();
            totakhir = totawal - (totawal * 20 / 100);
            System.out.println("Total belanjaan anda setelah diskon : Rp." + totakhir);
        } else {
            System.out.println("ID MEMBER tidak valid. Silahkan periksa kembali ID MEMBER anda/pencet Tidak");
        valid = false;
        }
    }
    if(member.equals("2")){
        valid = true;
        System.out.print("Masukkan total belanjaan anda : Rp.");
        totawal = input.nextInt();

        if(totawal >= 100000){
            System.out.println("Selamat, anda mendapatkan diskon 10%");
            totakhir = totawal - (totawal * 10 / 100);
            System.out.println("Total belanjaan Anda : Rp." + totakhir);
        } else if(totawal >= 50000){
            System.out.println("Selamat, anda mendapatkan diskon 5%");
             totakhir = totawal - (totawal * 5 / 100);
             System.out.println("Total belanjaan Anda : Rp." + totakhir);
        } 
        
        else {
            System.out.println("Maaf, anda tidak mendapatkan diskon");
            System.out.println("Total belanjaan Anda : Rp." + totawal);
        }
    }  
    if(valid){
        System.out.println("Terima kasih telah berbelanja di toko kami");
    }
    input.close();
    } 

public static boolean isValidMember(String id) {
    try {
        File file = new File("D:\\TUGAS KULIAH\\Course\\card_code.txt");
        Scanner scanner = new Scanner(file);
        ArrayList<String> validIds = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            validIds.add(line.trim());
        }
        scanner.close();
        return validIds.contains(id);
    }catch (FileNotFoundException e) {
        System.out.println("File IDMEMBER.txt tidak ditemukan.");
        return false;
        }
    }
}
