package tugas_praktikum.perusahaan_jaket;

public class harga {
    private static final int harga_A = 100000;
    private static final int harga_B = 125000;
    private static final int harga_C = 175000;

    private static int diskon_A = 95000;
    private static int diskon_B = 120000;
    private static int diskon_C = 160000;

    public static int beliJaketA(int jumlah){
        if(jumlah>100)return diskon_A*jumlah;
        else return harga_A*jumlah;
    }

    public static int beliJaketB(int jumlah){
        if(jumlah>100)return diskon_B*jumlah;
        else return harga_B*jumlah;
    }

    public static int beliJaketC(int jumlah){
        if(jumlah>100)return diskon_C*jumlah;
        else return harga_C*jumlah;
    }
}

