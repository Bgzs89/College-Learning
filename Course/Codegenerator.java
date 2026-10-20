import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;
class Codegenerator {
    static void generate() {

        String kode = UUID.randomUUID().toString();

        try {
            FileWriter write = new FileWriter("card_code.txt", true);
            write.write(kode + "\n");
            write.close();
        } catch (IOException e) {
            System.out.println("Gagal: " + e.getMessage());
        }

    }
}
