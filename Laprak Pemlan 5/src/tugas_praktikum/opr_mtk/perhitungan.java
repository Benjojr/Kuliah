package tugas_praktikum.opr_mtk;

public class perhitungan {
    public static int penjumlahan(int a, int b) {
        return a+b;
    }

    public static int pengurangan(int a, int b) {
        return a-b;
    }

    public int perkalian(int a, int b){
        return a*b;
    }

    public double pembagian(int a, int b){
        return (double)a/b;
    }

    private int hitungFPB(int a, int b) {
        while (b != 0) {
            int sisa = a % b;
            a = b;
            b = sisa;
        }
        return a;
    }

    public String Sederhana(int pembilang, int penyebut) {
        int fpb = hitungFPB(pembilang, penyebut);
        int sederhanaPembilang = pembilang / fpb;
        int sederhanaPenyebut = penyebut / fpb;

        return sederhanaPembilang + "/" + sederhanaPenyebut;
    }
}
