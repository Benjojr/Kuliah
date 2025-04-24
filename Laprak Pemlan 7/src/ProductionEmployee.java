import java.time.LocalDate;

public class ProductionEmployee extends Employee {
    private int jumlahBarang;
    private double upahPerBarang;

    public ProductionEmployee(String nama, String nip, LocalDate tanggalLahir, int jumlahBarang, double upahPerBarang) {
        super(nama, nip, tanggalLahir);
        this.jumlahBarang = jumlahBarang;
        this.upahPerBarang = upahPerBarang;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }

    public void setJumlahBarang(int jumlahBarang) {
        this.jumlahBarang = jumlahBarang;
    }

    public double getUpahPerBarang() {
        return upahPerBarang;
    }

    public void setUpahPerBarang(double upahPerBarang) {
        this.upahPerBarang = upahPerBarang;
    }

    @Override
    public double earnings() {
        return jumlahBarang * upahPerBarang;
    }

    @Override
    public String toString() {
        return "Production Employee: " + super.toString() +
               "\nJumlah Barang: " + jumlahBarang +
               "\nUpah Per Barang: Rp" + upahPerBarang;
    }
}