// Subclass Check yang mewarisi dari Payment
class Check extends Payment {
    private String name;
    private String bankID;

    public Check(float amount, String name, String bankID) {
        super(amount);
        this.name = name;
        this.bankID = bankID;
    }

    @Override
    public boolean authorized() {
        // Logika untuk otorisasi cek
        return true; // Misalnya, selalu diotorisasi untuk contoh ini
    }
}
