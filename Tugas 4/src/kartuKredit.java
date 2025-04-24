class kartuKredit extends metodePembayaran {
    private String noKartu;
    
    // Konstruktor yang benar
    public kartuKredit(String noKartu) {
        this.noKartu = noKartu;
    }

    public String getNoKartu() {
        return noKartu;
    }

    @Override
    public void bayar(int jumlahPembayaran) {
        System.out.println("Jumlah pembayaran\t: Rp" + jumlahPembayaran);
    }
}