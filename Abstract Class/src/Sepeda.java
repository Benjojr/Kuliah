// Subclass Sepeda
class Sepeda extends Kendaraan {
    // Konstruktor
    public Sepeda() {
        super(2); // Sepeda biasanya memiliki 2 roda
    }

    @Override
    public void bergerak() {
        System.out.println("Sepeda bergerak dengan pedal.");
    }

    @Override
    public void berhenti() {
        System.out.println("Sepeda berhenti.");
    }
}