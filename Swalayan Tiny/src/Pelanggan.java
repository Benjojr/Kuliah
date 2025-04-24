public class Pelanggan {
    private String nama;
    private int PIN;
    private int saldo;
    private long noPelanggan;
    private String noPelangganString;
    private boolean diblokir = false;
    private int percobaan = 0;
    double cashback = 0;

    public Pelanggan(String nama, long noPelanggan, int PIN) {
        this.nama = nama;
        this.noPelanggan = noPelanggan;
        this.PIN = PIN;
        this.saldo = 0;
        this.noPelangganString = String.valueOf(noPelanggan);
    }

    public String getNama() {
        return nama;
    }

    public boolean isDiblokir() {
        return diblokir;
    }

    public int getPercobaan(){
        return percobaan;
    }

    public void topUp(int nominal) {
        this.saldo += nominal;
        System.out.println("Berhasil top up sebesar: Rp" + nominal);
    }

    public void displaySaldo() {
        System.out.println("Nama Pelanggan: " + nama);
        System.out.println("No Pelanggan: " + noPelangganString);
        System.out.println("Saldo: Rp" + saldo);
    }

    private boolean cekNoPelanggan(long noPelanggan) {
        if (this.noPelanggan == noPelanggan) {
            return true;
        } else {
            return false;
        }
    }

    private boolean cekPIN(int PIN) {
        if (this.PIN == PIN) {
            return true;
        } else {
            return false;
        }
    }

    public boolean verify(long noPelanggan, int PIN) {
        if (diblokir) {
            return false;
        }

        if (cekNoPelanggan(noPelanggan) && cekPIN(PIN)) {
            percobaan = 0;
            return true;
        } else {
            percobaan++;
            if (percobaan >= 3) {
                diblokir = true;
            }
            return false;
        }
    }

    private boolean cashback(String noPelangganString, int harga){
        String jenisRekening = noPelangganString.substring(0, 2);
        if(jenisRekening.equals("38")){
            if(harga >= 1000000){
                cashback = harga * 0.05;
            } else {
                cashback = 0;
            }
        }else if(jenisRekening.equals("56")){
            if(harga >= 1000000){
                cashback = harga * 0.07;
            } else {
                cashback = harga * 0.02;
            }
        }else if(jenisRekening.equals("74")){
            if(harga >= 1000000){
                cashback = harga * 0.1;
            } else {
                cashback = harga * 0.05;
            }
        }
        if(cashback > 0)return true;
        return false;
    }

    public void beli(int pilihan) {
        DaftarProduk daftarProduk = new DaftarProduk();
        String[] produk = daftarProduk.getDaftarProduk();
        int[] hargaProduk = daftarProduk.getHargaProduk();

        if (this.saldo < hargaProduk[pilihan - 1]) {
            System.out.println("Saldo tidak cukup untuk membeli " + produk[pilihan - 1]);
        } else if ((this.saldo - hargaProduk[pilihan - 1]) < 10000) {
            System.out.println("Saldo akhir tidak boleh kurang dari Rp10.000 setelah pembelian");
        } else {
            this.saldo -= hargaProduk[pilihan - 1];
            System.out.println("Berhasil membeli " + produk[pilihan - 1] + " sebesar: Rp" + hargaProduk[pilihan - 1]);
            if(cashback(noPelangganString, hargaProduk[pilihan - 1])){
                System.out.println("Cashback sebesar: Rp" + cashback);
                this.saldo += cashback;
                System.out.println("Saldo akhir: Rp" + this.saldo);
            }
        }
    }
}
