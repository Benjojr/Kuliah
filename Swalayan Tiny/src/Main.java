import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        Pelanggan pelanggan = new Pelanggan("Uchiha Asep", 3898765432L, 3838);
        DaftarProduk daftarProduk = new DaftarProduk();

        System.out.println("======= SELAMAT DATANG " + pelanggan.getNama().toUpperCase() + " =======");

        while (true) {
            System.out.println("\n======= MENU SWALAYAN TINY =======");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Top Up Saldo");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            int choice = io.nextInt();

            switch (choice) {
                case 1:
                    if (pelanggan.isDiblokir()) {
                        System.out.println("Akun anda telah diblokir.");
                        break;
                    }
                    pelanggan.displaySaldo();
                    break;

                case 2:
                    if (pelanggan.isDiblokir()) {
                        System.out.println("Akun anda telah diblokir.");
                        break;
                    }

                    boolean verified = false;
                    int percobaan = 0;

                    while (!verified && percobaan < 3) {
                        System.out.print("Masukkan PIN: ");
                        int PIN = io.nextInt();
                        System.out.print("Masukkan No Pelanggan: ");
                        long noPelanggan = io.nextLong();

                        if (pelanggan.verify(noPelanggan, PIN)) {
                            System.out.print("Nominal Top Up: ");
                            int nominal = io.nextInt();
                            pelanggan.topUp(nominal);
                            verified = true;
                        } else {
                            percobaan++;
                            System.out
                                    .println("No Pelanggan atau PIN salah! Tersisa " + (3 - percobaan) + " percobaan");
                        }
                    }

                    if (!verified) {
                        System.out.println("Akun anda telah diblokir.");
                    }
                    break;

                case 3:
                    if (pelanggan.isDiblokir()) {
                        System.out.println("Akun anda telah diblokir.");
                        break;
                    }

                    percobaan = 0;
                    verified = false;

                    while (!verified && percobaan < 3) {
                        System.out.print("Masukkan PIN: ");
                        int PIN = io.nextInt();
                        System.out.print("Masukkan No Pelanggan: ");
                        long noPelanggan = io.nextLong();

                        if (pelanggan.verify(noPelanggan, PIN)) {
                            System.out.println("\n======= DAFTAR PRODUK =======");
                            for (int i = 0; i < daftarProduk.getDaftarProduk().length; i++) {
                                System.out.println((i + 1) + ". " + daftarProduk.getDaftarProduk()[i] + " - Rp"
                                        + daftarProduk.getHargaProduk()[i]);
                            }
                            System.out.print("Pilihan: ");
                            int pilihan = io.nextInt();
                            pelanggan.beli(pilihan);
                            verified = true;
                        } else {
                            percobaan++;
                            System.out
                                    .println("No Pelanggan atau PIN salah! Tersisa " + (3 - percobaan) + " percobaan");
                        }
                    }

                    if (!verified) {
                        System.out.println("Akun anda telah diblokir.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih telah berbelanja di Swalayan Tiny!");
                    io.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
