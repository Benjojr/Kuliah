import java.time.LocalDate;
public class Pembayaran {
    private String idPembayaran;
    private double jumlah;
    public LocalDate tanggalPembayaran;
    private Rekening rekeningTujuan;

    public Pembayaran(String idPembayaran, double jumlah, LocalDate tanggalPembayaran, Rekening rekeningTujuan) {
        this.idPembayaran = idPembayaran;
        this.jumlah = jumlah;
        this.tanggalPembayaran = tanggalPembayaran;
        this.rekeningTujuan = rekeningTujuan;
    }

    public String getIdPembayaran() {
        return idPembayaran;
    }

    public void setIdPembayaran(String idPembayaran) {
        this.idPembayaran = idPembayaran;
    }

    public double getJumlah() {
        return jumlah;
    }

    public void setJumlah(double jumlah) {
        this.jumlah = jumlah;
    }

    public LocalDate getTanggalPembayaran() {
        return tanggalPembayaran;
    }

    public void setTanggalPembayaran(LocalDate tanggalPembayaran) {
        this.tanggalPembayaran = tanggalPembayaran;
    }

    public Rekening getRekeningTujuan() {
        return rekeningTujuan;
    }

    public void setRekeningTujuan(Rekening rekeningTujuan) {
        this.rekeningTujuan = rekeningTujuan;
    }

    public void prosesPembayaran(){
        System.out.println("Pembayaran dengan ID " + idPembayaran + " sebesar " + jumlah + " telah diproses pada tanggal " + tanggalPembayaran);
    }

    @Override
    public String toString() {
        return "Pembayaran{" +
                "idPembayaran='" + idPembayaran + '\'' +
                ", jumlah=" + jumlah +
                ", tanggalPembayaran=" + tanggalPembayaran +
                ", rekeningTujuan=" + rekeningTujuan +
                '}';
    }
}
