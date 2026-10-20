package jalanberhenti;

public class Mobil implements Kendaraan {
    @Override
    public void mulai() {
        System.out.println("Mobil mulai berjalan");
    }
    
    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti");
    }
}	