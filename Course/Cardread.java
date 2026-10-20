import java.util.Scanner;
import java.io.File;
class Cardread {
    static void cardread(){
        Scanner scan = new Scanner(System.in);

        String password = "";
            try {
                Scanner fileread = new Scanner(new File("password.txt"));
                password = fileread.nextLine();
                fileread.close();
            }   catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }

        String pass;

        System.out.print("Input Password : ");
        pass = scan.nextLine();

        
        if (pass.equals(password)) {
            System.out.println("Password Correct\nYou want to generate new Card Code? ");
            System.out.println("1.Yes\n2.No");
                int yesno = scan.nextInt();

                if (yesno == 1) {
                    Codegenerator.generate();
                    System.out.println("Succes generate code!!");
                } else {
                    System.out.println("Cancel");
                }

        }   else {
            System.out.println("Password is wrong");
        }

        scan.close();
    }
}