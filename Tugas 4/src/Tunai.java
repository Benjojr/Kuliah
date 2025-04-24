class Tunai extends metodePembayaran{

    @Override
    public void bayar(int jumlahPembayaran) {
        System.out.println("Jumlah pembayaran\t: Rp"+jumlahPembayaran);
    }
}
