public class Rekening {
    private String nomorrekening;
    private double saldo;
    private String jenisRekening;

    public Rekening(String nomorrekening, double jumlah, String jenisRekening) {
        this.nomorrekening = nomorrekening;
        this.saldo = jumlah;
        this.jenisRekening = jenisRekening;
    }

    public String getNomorRekening() {
        return nomorrekening;
    }

    public void setNomorRekening(String nomorrekening) {
        this.nomorrekening = nomorrekening;
    }

    public double getJumlah() {
        return saldo;
    }

    public void setJumlah(double jumlah) {    
        this.saldo = jumlah;
    }

    public String getJenisRekening() {
        return jenisRekening;
    }

    public void setJenisRekening(String jenisRekening) {
        this.jenisRekening = jenisRekening;
    }

    public void deposit(double jumlah) {
        this.saldo += jumlah;
        System.out.println("Deposit berhasil. Saldo baru: "+ this.saldo);
    }

    public void withdraw(double jumlah) {
        this.saldo -= jumlah;
        System.out.println("Penarikan berhasil. Saldo baru: "+ this.saldo);
    }

    @Override
    public String toString() {
        return "Rekening{"+
                "nomorRekening='" + nomorrekening + '\'' +
                ", saldo=" + saldo +
                ", jenisRekening='" + jenisRekening + '\'' +
                '}';
    }
}
