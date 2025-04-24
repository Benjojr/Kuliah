package static_method;

import java.util.Scanner;

public class MainAritmatika {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukkan nilai 1 : ");
        int nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int nil2 = in.nextInt();
        // memanggil method static
        Aritmatika.hitungPengurangan(nil1, nil2);

        System.out.print("masukkan nilai 1 : ");
        nil1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        nil2 = in.nextInt();
        // memanggil method static
        Aritmatika.hitungPerkalian(nil1, nil2);

        System.out.print("masukkan nilai 1 : ");
        int value1 = in.nextInt();
        System.out.print("masukkan nilai 2 : ");
        int value2 = in.nextInt();
        // memanggil method NONstatic harus melalui objek
        Aritmatika a = new Aritmatika();
        a.hitungPenjumlahan(value1, value2);
        
        System.out.print("masukkan nilai 1 : ");
        String Nil1 = in.next();
        System.out.print("masukkan nilai 2 : ");
        String Nil2 = in.next();
        // memanggil method static
        System.out.println("nilai pembagian adalah : "+
        Aritmatika.hitungPembagian(Nil1, Nil2));
    }
}
