// Subclass Pesawat
class Pesawat extends Kendaraan {
    // Konstruktor
    public Pesawat() {
        super(3); // Pesawat biasanya memiliki 3 roda (landing gear)
    }

    @Override
    public void bergerak() {
        System.out.println("Pesawat terbang di udara.");
    }

    @Override
    public void berhenti() {
        System.out.println("Pesawat mendarat.");
    }
}