public class Main {
    public static void main(String[] args) {
        Kendaraan mobil = new Mobil();
        Kendaraan motor = new Motor();
        metodePembayaran tunai = new Tunai();
        metodePembayaran kartuKredit = new kartuKredit("1234567812345678");
        cuciKendaraan(mobil, kartuKredit, 40000);
        cuciKendaraan(motor, tunai, 15000);
    }

    public static void cuciKendaraan(Kendaraan kendaraan, metodePembayaran metodePembayaran, int jumlahPembayaran) {
        System.out.println("====================================");
        System.out.println("Jenis Kendaraan\t\t: " + kendaraan.getClass().getSimpleName());
        
        if (metodePembayaran instanceof kartuKredit) {
            kartuKredit kk = (kartuKredit) metodePembayaran;
            System.out.println("Metode Pembayaran\t: Kartu Kredit");
            System.out.println("Nomor kartu kredit\t: " + kk.getNoKartu());
        }else System.out.println("Metode Pembayaran\t: Tunai");
        
        metodePembayaran.bayar(jumlahPembayaran);
        
        System.out.println("Biaya cuci kendaraan\t: Rp" + kendaraan.biayaCUci());
        System.out.println("Kembalian\t\t: Rp" + (jumlahPembayaran - kendaraan.biayaCUci()));
        System.out.println("====================================");
        System.out.println();
    }
}