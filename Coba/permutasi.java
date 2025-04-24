import java.util.Scanner;

public class permutasi {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        boolean ulang = true;
        while (ulang) {
            Menu();
            int pil = io.nextInt();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan nilai n: ");
                    int n = io.nextInt();
                    System.out.print("Masukkan nilai r: ");
                    int r = io.nextInt();

                    int hasil = faktorial(n) / faktorial(n - r);
                    System.out.printf("%10s\n", "n!");
                    System.out.println("nPr = ------ = " + hasil);
                    System.out.printf("%12s\n", "(n-r)!");
                    System.out.println("Maka Hasil Permutasinya adalah : " + hasil);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Masukkan nilai n: ");
                    n = io.nextInt();
                    System.out.print("Masukkan nilai r: ");
                    r = io.nextInt();

                    hasil = faktorial(n) / (faktorial(n - r) * faktorial(r));
                    System.out.printf("%12s\n", "n!");
                    System.out.println("nCr = ----------- = " + hasil);
                    System.out.printf("%17s\n", "(n-r)! x r!");
                    System.out.println("Maka Hasil Kombinasinya adalah : " + hasil);
                    System.out.println();
                    break;

                case 3:
                    io.close();
                    ulang = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    System.out.println();
                    break;
            }
        }
    }

    public static void Menu() {
        System.out.println("Program Penghitung Kombinasi dan Permutasi");
        System.out.println("1. Menghitung Permutasi");
        System.out.println("2. Menghitung Kombinasi");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan anda: ");
    }

    public static int faktorial(int z) {
        int hasil = 1;
        for (int x = 1; x <= z; x++) {
            hasil *= x;
        }
        return hasil;
    }
}