public class Manusia {
    private String nama;
    private boolean jenisKelamin;
    private String nik;
    private boolean menikah;

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.nik = nik;
        this.menikah = menikah;
    }

    public double getTunjangan() {
        if (menikah) {
            if (jenisKelamin) {
                return 25;
            } else {
                return 20;
            }
        } else {
            return 15;
        }
    }


    public boolean isMenikah() {
        return menikah;
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "nama\t\t: " + nama + "\nnik\t\t: " + nik + "\njenisKelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") 
                + "\npendapatan\t: " + getPendapatan();
    }
}
