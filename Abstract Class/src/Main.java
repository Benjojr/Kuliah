public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan sepeda = new Sepeda();
        Kendaraan pesawat = new Pesawat();

        mobil.bergerak();
        System.out.println("Jumlah roda: " + mobil.getRoda());
        mobil.berhenti();

        sepeda.bergerak();
        System.out.println("Jumlah roda: " + sepeda.getRoda());
        sepeda.berhenti();

        pesawat.bergerak();
        System.out.println("Jumlah roda: " + pesawat.getRoda());
        pesawat.berhenti();
    }
}