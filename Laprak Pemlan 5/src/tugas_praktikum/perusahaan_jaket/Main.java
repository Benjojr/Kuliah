package tugas_praktikum.perusahaan_jaket;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Masukkan jumlah jaket A yang dibeli: ");
        int jumlahA = io.nextInt();
        System.out.print("Masukkan jumlah jaket B yang dibeli: ");
        int jumlahB = io.nextInt();
        System.out.print("Masukkan jumlah jaket C yang dibeli: ");
        int jumlahC = io.nextInt();
        harga harga = new harga();

        int totalA = harga.beliJaketA(jumlahA);
        int totalB = harga.beliJaketB(jumlahB);
        int totalC = harga.beliJaketC(jumlahC);
        System.out.println("Total harga jaket A: " + totalA);
        System.out.println("Total harga jaket B: " + totalB);
        System.out.println("Total harga jaket C: " + totalC);
        System.out.println("Total harga semua jaket: "
                + (totalA + totalB + totalC));
    }
}


