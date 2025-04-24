import java.util.Scanner;

public class Praktik1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double kel, luas, a, b, c, s, r;
        System.out.println("Menu:");
        System.out.println("1. Menghitung luas dan keliling persegi panjang");
        System.out.println("2. Menghitung luas dan keliling lingkaran");
        System.out.println("3. Menghitung luas dan keliling segitiga");
        System.out.print("Pilihan anda: "); int pilihan = input.nextInt();

        switch(pilihan){
            case 1:
                System.out.print("\nMasukkan panjang\t: ");
                a = input.nextDouble();
                System.out.print("Masukkan lebar\t\t: ");
                b = input.nextDouble();
                kel = 2*(a+b);
                luas = a*b;

                System.out.printf("\n%s: %.0f %s", "Keliling persegi panjang", kel, "cm");
                System.out.printf("\n%s\t: %.0f %s", "Luas persegi panjang", luas, "cm2");
            break;
            
            case 2:
                System.out.print("\nMasukkan jari-jari\t: ");
                r = input.nextDouble();
                kel = 2*Math.PI*r;
                luas = Math.PI*r*r;

                System.out.printf("\n%s\t: %.2f %s", "Keliling lingkaran", kel, "cm");
                System.out.printf("\n%s\t\t: %.2f %s", "Luas lingkaran", luas, "cm2");
            break;

            case 3:
                System.out.print("\nMasukkan sisi a: ");
                a = input.nextDouble();
                System.out.print("Masukkan sisi b: ");
                b = input.nextDouble();
                System.out.print("Masukkan sisi c: ");
                c = input.nextDouble();
                kel = a+b+c;
                s = kel/2;
                luas = Math.sqrt(s*(s-a)*(s-b)*(s-c));

                System.out.printf("\n%s\t: %.0f %s", "Keliling segitiga", kel, "cm");
                System.out.printf("\n%s\t\t: %.0f %s", "Luas segitiga", luas, "cm2");
            break;

            default:
                System.out.print("Data tak ditemukan, program dihentikan ...");
        }
    }
}

