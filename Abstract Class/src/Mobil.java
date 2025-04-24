// Subclass Pesawat
class Mobil extends Kendaraan {
    // Konstruktor
    public Mobil() {
        super(3); // Pesawat biasanya memiliki 3 roda (landing gear)
    }

    @Override
    public void bergerak() {
        System.out.println("Mobil bergerak di darat.");
    }

    @Override
    public void berhenti() {
        System.out.println("Mobil berhenti.");
    }
}