public class DaftarProduk {
    private String[] daftarProduk;
    private int[] hargaProduk;
    
    public DaftarProduk() {
        daftarProduk = new String[4];
        hargaProduk = new int[4];

        daftarProduk[0] = "Spidol tanpa Tinta";
        daftarProduk[1] = "Jam Dinding tanpa Jarum";
        daftarProduk[2] = "Lukisan Pesawat dari Jauh";
        daftarProduk[3] = "Lukisan Bintang yang Hilang";

        hargaProduk[0] = 500000;
        hargaProduk[1] = 750000;
        hargaProduk[2] = 1200000;
        hargaProduk[3] = 1500000;
    }

    public String[] getDaftarProduk() {
        return daftarProduk;
    }

    public int[] getHargaProduk() {
        return hargaProduk;
    }
}
