//Kelas abstrak kendaraan
abstract class Kendaraan { 
    //Atribut
    protected int roda;

    //Konstruktor
    public Kendaraan(int roda) {
        this.roda = roda;
    }

    
    public abstract void bergerak();
    public abstract void berhenti();

    //Method mendapatkan jumlahroda
    public int getRoda() {
        return roda;
    }
}