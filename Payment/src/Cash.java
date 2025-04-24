// Subclass Cash yang mewarisi dari Payment
class Cash extends Payment {
    private float cashTendered;

    public Cash(float amount, float cashTendered) {
        super(amount);
        this.cashTendered = cashTendered;
    }

    @Override
    public boolean authorized() {
        return cashTendered >= amount;
    }
}
