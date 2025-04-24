import java.util.*;

public class soal1 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);

        int[] data = new int[999];
        int pjg = 0, maks = 0, min = 0;

        while (true) {
            System.out.println("MENU");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. KELUAR");
            System.out.println();
            System.out.print("Masukkan nilai: ");
            int pil = io.nextInt();

            switch (pil) {
                case 0:
                    return;

                case 1:
                    System.out.print("Masukkan data: ");
                    data[pjg] = io.nextInt();
                    pjg++;
                    System.out.println();
                    System.out.println();
                    break;

                case 2:
                    if (pjg == 0) {
                        System.out.print("Belum ada data yang dimasukkan");
                    } else {
                        System.out.print("Data: ");
                        int x = 0;
                        while (x < pjg) {
                            if (x == pjg - 1) {
                                System.out.print(data[x]);
                            } else {
                                System.out.print(data[x] + ", ");
                            }
                            x++;
                        }
                    }
                    System.out.println();
                    System.out.println();
                    break;

                case 3:
                    if (pjg == 0) {
                        System.out.print("Belum ada data yang dimasukkan");
                    } else {
                        System.out.print("Rata-rata: ");
                        int x = pjg - 1;
                        double rt = 0;
                        while (x >= 0) {
                            rt = rt + data[x];
                            x--;
                        }
                        System.out.printf("%.1f", rt / pjg);
                    }
                    System.out.println();
                    System.out.println();
                    break;

                case 4:
                    if (pjg == 0) {
                        System.out.print("Belum ada data yang dimasukkan");
                    } else {
                        System.out.print("Jumlah: ");
                        int x = pjg - 1;
                        int jmlh = 0;
                        while (x >= 0) {
                            jmlh += data[x];
                            x--;
                        }
                        System.out.print(jmlh);
                    }
                    System.out.println();
                    System.out.println();
                    break;

                case 5:
                    if (pjg == 0) {
                        System.out.print("Belum ada data yang dimasukkan");
                    } else {
                        int x = 0;
                        while (x < pjg) {
                            if (x == 0) {
                                maks = data[0];
                            } else if (maks < data[x]) {
                                maks = data[x];
                            }
                            x++;
                        }
                        System.out.print("Data terbesar: " + maks);
                    }
                    System.out.println();
                    System.out.println();
                    break;

                case 6:
                    if (pjg == 0) {
                        System.out.print("Belum ada data yang dimasukkan");
                    } else {
                        int x = 0;
                        while (x < pjg) {
                            if (x == 0) {
                                min = data[0];
                            } else if (min > data[x]) {
                                min = data[x];
                            }
                            x++;
                        }
                        System.out.print("Data terkecil: " + min);
                    }
                    System.out.println();
                    System.out.println();
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    System.out.println();
            }
        }
    }
}
