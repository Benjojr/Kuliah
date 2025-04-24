import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah suku: ");
        int n = input.nextInt(), x = 1;
        int u1 = 0, u2 = 1, un;

        if(n<=0){
            System.out.print("Input salah!! Masukkan angka diatas 0");
            return;
        }

        //Penrulangan
        do {
            System.out.print(u1);
            if (x < n) {
                System.out.print(", ");
            }
            un = u1 + u2;
            u1 = u2;
            u2 = un;
            x++;
        } while (x <= n);
    }
}