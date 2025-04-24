import java.util.Scanner;

public class cariprima {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int n = io.nextInt();
        int[] input = new int[n];
        for(int i = 0; i < n; i++){
            input[i] = io.nextInt();
        }

        int a = 0;
        while(a < input.length){
            if(prima(input[a]) && fibonaci(input[a])){
                System.out.println("Bilangan tersebut merupakan bilangan prima ke - " + urutanPrima(input[a]) + 
                                   " dan bilangan fibonachi ke - " + urutanFibonacci(input[a]) + ".");
            } else if(prima(input[a]) && !fibonaci(input[a])){
                System.out.println("Bilangan tersebut merupakan bilangan prima ke - " + urutanPrima(input[a]) + ".");
            } else if(!prima(input[a]) && fibonaci(input[a])){
                System.out.println("Bilangan tersebut merupakan bilangan fibonachi ke - " + urutanFibonacci(input[a]) + ".");
            } else {
                System.out.println("Bilangan tersebut bukan bilangan prima maupun fibonachi.");
            }
            a++;
        }
    }

    public static boolean prima(int x) {
        if (x <= 1)
            return false;
        if (x <= 3)
            return true;
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int urutanPrima(int x) {
        int primaKe = 0;
        int nomor = 2;
        while (nomor <= x) {
            if (prima(nomor)) {
                primaKe++;
            }
            if (nomor == x) {
                return primaKe;
            }
            nomor++;
        }
        return -1;
    }

    public static boolean fibonaci(int x) {
        if (x < 0) return false;
        int a = 0, b = 1;
        while (a < x) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return a == x;
    }

    public static int urutanFibonacci(int x) {
        int a = 0, b = 1;
        int nomor = 1;
        
        while (a <= x) {
            if (a == x) {
                return nomor;
            }
            int temp = a + b;
            a = b;
            b = temp;
            nomor++;
        }
        return -1;
    }
}
