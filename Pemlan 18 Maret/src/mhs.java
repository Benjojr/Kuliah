import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class mhs {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        List<Integer> nilai = new ArrayList<>();

        while (true) {
            String input = io.next();
            try {
                if (input.equals("done")) {
                    break;
                } else {
                    int angka = Integer.parseInt(input);
                    nilai.add(angka);
                }
            } catch (NumberFormatException e) {
                System.out.println("Inputan bukan angka, coba lagi:");
            }
        }
        try {
            System.out.println(hitungRataRata(nilai));
        } catch (ArithmeticException e) {
            System.out.println("Daftar nilai kosong. Gagal menghitung rata-rata.");
        }
    }

    static double hitungRataRata(List<Integer> nilai) {
        int total = 0;
        for (int i = 0; i < nilai.size(); i++) {
            total = total + nilai.get(i);
        }
        return total / (nilai.size());
    }
}
