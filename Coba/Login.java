import java.util.Scanner;

public class Login{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //Minta data
        System.out.print("Buat username baru: ");
        String nama = input.nextLine();
        System.out.print("Buat password baru: ");
        String pw = input.nextLine();
        
        //Verifikasi
        System.out.print("Masukkan username: ");
        String nama2 = input.nextLine();
        System.out.print("Masukkan password: ");
        String pw2 = input.nextLine();

        //Hasil verifikasi
        String hasil = (nama2.equals(nama) && pw2.equals(pw))?"Nama\t: Ben Jason\nNIM\t: 245150200111004" : "Data tidak ditemukan";
        System.out.print(hasil);
    }
}