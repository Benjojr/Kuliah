import java.util.*;
public class soal2 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int pilkret = 0, bnyktkt = 0;
        String[][] kreta = {
            {"Jenis", "Harga", "Diskon", "AC", "Colokan"},
            {"Ekonomi", "50000", "2%", "Tidak Ada", "Tidak Ada"},
            {"Bisnis", "100000", "5%", "Ada", "Tidak Ada"},
            {"Eksekutif", "200000", "7%", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10%", "Ada", "Ada"}};
        
        String[] jekret = new String[100];
        String[] harkret = new String[100];
        String[] diskret = new String[100];
        int[] hardis = new int[100];

        while (true) {
            System.out.println("MENU");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang Ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang Ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pemesanan Tiket");
            System.out.println("0. KELUAR");
            System.out.println();
            System.out.print("Masukkan nilai: ");
            int pil = io.nextInt();

            switch (pil) {
                case 0:
                    return;

                case 1:
                    int baris = 0;
                    while (baris < kreta.length) {
                        int kolom = 0;
                        while (kolom < kreta[baris].length) {
                            System.out.printf("%-15s", kreta[baris][kolom]);
                            kolom++;
                        }
                        System.out.println();
                        baris++;
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.println("Daftar kereta yang memiliki AC: ");
                    int x = 1;
                    while (x < kreta.length) {
                        if (kreta[x][3].equals("Ada")) {
                            System.out.println(kreta[x][0]);
                        }
                        x++;
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Daftar kereta yang memiliki Colokan: ");
                    x = 1;
                    while (x < kreta.length) {
                        if (kreta[x][4].equals("Ada")) {
                            System.out.println(kreta[x][0]);
                        }
                        x++;
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("1. Ekonomi");
                    System.out.println("2. Bisnis");
                    System.out.println("3. Eksekutif");
                    System.out.println("4. Pariwisata");
                    System.out.print("Pilih jenis kereta yang ingin anda naiki: ");
                    pilkret = io.nextInt();
                    System.out.println("Tiket disimpan untuk " + kreta[pilkret][0]);

                    jekret[bnyktkt] = kreta[pilkret][0];
                    harkret[bnyktkt] = kreta[pilkret][1];
                    diskret[bnyktkt] = kreta[pilkret][2];

                    int harkret2 = Integer.parseInt(harkret[bnyktkt]);
                    int diskret2 = Integer.parseInt(diskret[bnyktkt].replace("%", ""));
                    hardis[bnyktkt] = harkret2 - (harkret2 * diskret2 / 100);
                    bnyktkt++;
                    System.out.println();
                    break;

                case 5:
                    if (bnyktkt==0){System.out.println("Anda belum memesan tiket");}
                    else{
                        System.out.printf("%-15s%-15s%-15s%-15s\n", "Jenis Kereta", "Harga", "Diskon", "Harga Setelah Diskon");
                        x = 0;
                        while (x < bnyktkt) {
                            System.out.printf("%-15s%-15s%-15sRp%-15d\n", jekret[x], harkret[x], diskret[x], hardis[x]);
                            x++;
                        }
                    }
                    System.out.println();
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid");
                    
            }
        }
    }
}
