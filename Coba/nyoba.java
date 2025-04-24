import java.util.Scanner;
public class nyoba {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        int ver = 1;

        // Menggunakan while loop untuk menggantikan for loop
        while (ver <= n) {
            int hor = 1;
            while (hor <= n) {
                System.out.printf("%-3d ", ver * hor);
                hor++;
            }
            System.out.println();  // Pindah ke baris baru setelah setiap baris tabel selesai
            ver++;
        }
    }
}
