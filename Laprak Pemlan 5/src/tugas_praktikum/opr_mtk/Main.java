package tugas_praktikum.opr_mtk;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        perhitungan a = new perhitungan();
        Scanner io = new Scanner(System.in);

        // Penjumlahan
        System.out.print("Masukkan angka pertama : ");
        int angka1 = io.nextInt();
        System.out.print("Masukkan angka kedua : ");
        int angka2 = io.nextInt();
        System.out.println("Hasil penjumlahan = " +
                perhitungan.penjumlahan(angka1, angka2));

        // Pengurangan
        System.out.print("Masukkan angka pertama : ");
        angka1 = io.nextInt();
        System.out.print("Masukkan angka kedua : ");
        angka2 = io.nextInt();
        System.out.println("Hasil pengurangan = " +
                perhitungan.pengurangan(angka1, angka2));

        // Perkalian
        System.out.print("Masukkan angka pertama : ");
        angka1 = io.nextInt();
        System.out.print("Masukkan angka kedua : ");
        angka2 = io.nextInt();
        System.out.println("Hasil perkalian = " +
                a.perkalian(angka1, angka2));

        // Pembagian
        System.out.print("Masukkan angka pertama : ");
        angka1 = io.nextInt();
        System.out.print("Masukkan angka kedua : ");
        angka2 = io.nextInt();
        System.out.println("Hasil pembagian = " +
                a.pembagian(angka1, angka2));

        // Penyederhanaan
        System.out.print("Masukkan angka pertama : ");
        angka1 = io.nextInt();
        System.out.print("Masukkan angka kedua : ");
        angka2 = io.nextInt();
        System.out.println("Hasil penyederhanaan = " +
                a.Sederhana(angka1, angka2));
    }
}


