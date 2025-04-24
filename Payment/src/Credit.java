// Subclass Credit yang mewarisi dari Payment
class Credit extends Payment {
    private String name;
    private String type;
    private String expDate;

    public Credit(float amount, String name, String type, String expDate) {
        super(amount);
        this.name = name;
        this.type = type;
        this.expDate = expDate;
    }

    @Override
    public boolean authorized() {
        // Logika untuk otorisasi kartu kredit
        return true; // Misalnya, selalu diotorisasi untuk contoh ini
    }
}
