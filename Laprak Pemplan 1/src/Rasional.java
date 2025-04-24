public class Rasional {
    private int pembilang, penyebut;

    public Rasional() {
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int pbl, int pyb) {
        pembilang = pbl;
        penyebut = pyb;
    }

    // Mengecek apakah suatu bilangan adalah rasional
    public boolean isRasional() {
        return (penyebut != 0);
    }

    // Menyederhanakan bilangan rasional
    public void Sederhana() {
        if (penyebut == 0) {
            return;
        }
    
        int A = Math.abs(pembilang);
        int B = Math.abs(penyebut);
    
        for (int temp; B != 0; ) {
            temp = A % B;
            A = B;
            B = temp;
        }
    
        pembilang /= A;
        penyebut /= A;
    }
    

    public double Cast() {
        return (penyebut == 0) ? 0.0 : (double) pembilang / (double) penyebut;
    }

    // Operator >
    public boolean moreThan(Rasional A) {
        return (pembilang * A.penyebut > penyebut * A.pembilang);
    }

    public boolean lessThan(Rasional A) {
        return (pembilang * A.penyebut < penyebut * A.pembilang);
    }

    public boolean lessThanEqual(Rasional A) {
        return (pembilang * A.penyebut <= penyebut * A.pembilang);
    }

    public boolean greaterThanEqual(Rasional A) {
        return (pembilang * A.penyebut >= penyebut * A.pembilang);
    }

    // Operator Unary (-A)
    public void negasi() {
        pembilang = -pembilang;
    }

    // Operator unary +=
    public void unaryPlus(Rasional A) {
        pembilang = pembilang * A.penyebut + penyebut * A.pembilang;
        penyebut *= A.penyebut;
    }

    public Rasional kurang(Rasional A) {
        int newPembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        int newPenyebut = penyebut * A.penyebut;
        return new Rasional(newPembilang, newPenyebut);
    }

    // Metode untuk perkalian (R1 * R2)
    public Rasional kali(Rasional A) {
        int newPembilang = pembilang * A.pembilang;
        int newPenyebut = penyebut * A.penyebut;
        return new Rasional(newPembilang, newPenyebut);
    }

    // Metode untuk pembagian (R1 / R2)
    public Rasional bagi(Rasional A) {
        int newPembilang = pembilang * A.penyebut;
        int newPenyebut = penyebut * A.pembilang;
        return new Rasional(newPembilang, newPenyebut);
    }

    public void cetak() {
        System.out.println(pembilang + "/" + penyebut);
    }
}