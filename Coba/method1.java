import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        // Menampilkan Menu
        printMenu();
        System.out.print("Masukkan pilihan anda: ");
        int pil = io.nextInt();
        System.out.println();
        // End Menampilkan Menu

        while (pil != 5) {
            // Mengitung luas persegi panjang
            if (pil == 1) {
                System.out.println("Menghitung Luas Persegi Panjang");
                System.out.print("Panjang: ");
                double pjg = io.nextDouble();
                System.out.print("Lebar: ");
                double lbr = io.nextDouble();
                System.out.println("Luas: " + HitungLuasPersegiPanjang(pjg, lbr) + "\n");
            } // Akhir perhitungan luas persegi panjang

            // Menghitung luas persegi
            else if (pil == 2) {
                System.out.println("Menghitung Luas Persegi");
                System.out.print("Sisi: ");
                double sisi = io.nextDouble();
                System.out.println("Luas: " + HitungLuasPersegi(sisi) + "\n");
            } // Akhir perhitungan luas persegi

            // Menghitung luas segitiga
            else if (pil == 3) {
                System.out.println("Menghitung Luas Segitiga");
                System.out.print("Alas: ");
                double alas = io.nextDouble();
                System.out.print("Tinggi: ");
                double tinggi = io.nextDouble();
                System.out.println("Luas: " + HitungLuasSegitiga(alas, tinggi) + "\n");
            } // Akhir perhitungan luas segitiga

            // Menghitung luas lingkaran
            else if (pil == 4) {
                System.out.println("Menghitung Luas Lingkaran");
                System.out.print("Jari-jari: ");
                double r = io.nextDouble();
                System.out.println("Luas: " + HitungLingkaran(r) + "\n");
            } // Akhir perhitungan luas lingkaran

            printMenu();
            System.out.print("Masukkan pilihan anda: ");
            pil = io.nextInt();
            System.out.println();
        }
    }

    public static void printMenu() {
        System.out.println("--------M E N U--------");
        System.out.println("=======================");
        System.out.println("1. Luas Persegi Panjang");
        System.out.println("2. Luas Persegi");
        System.out.println("3. Luas Segitiga");
        System.out.println("4. Luas Lingkaran");
        System.out.println("5. Keluar");
        System.out.println("=======================");
    }

    public static double HitungLuasPersegiPanjang(double pjg, double lbr) {
        double Luas = pjg * lbr;
        return Luas;
    }

    public static double HitungLuasPersegi(double sisi) {
        double Luas = sisi * sisi;
        return Luas;
    }

    public static double HitungLuasSegitiga(double alas, double tinggi) {
        double Luas = (alas * tinggi) / 2;
        return Luas;
    }

    public static double HitungLingkaran(double r) {
        double Luas = (22 * r * r) / 7;
        return Luas;
    }
}
