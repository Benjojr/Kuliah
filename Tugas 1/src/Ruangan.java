public class Ruangan {
    private String kodeRuangan;
    private String namaRuangan;
    private char gedung;

    public Ruangan(String kodeRuangan, String namaRuangan, char gedung) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
        switch (gedung) {
            case 'G', 'A', 'F':
                this.gedung = gedung;
                break;
            default:
                throw new IllegalArgumentException("Gedung lain tidak tersedia");
        }
    }

    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public String getNamaRuangan() {
        return namaRuangan;
    }

    public char getGedung() {
        return gedung;
    }

    @Override
    public String toString() {
        return "(" + kodeRuangan + ", " + namaRuangan + ", " + gedung + ")";
    }
}
