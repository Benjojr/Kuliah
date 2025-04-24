import java.util.Scanner;
 
public class Tugas {
    public static void main(String[] args){
        //Deklarasi variabel
        double akhir, kuis, uas, tugas;
        int bobot = 0;
        String huruf = "";
        String ket = "";

        //Input
        Scanner input = new Scanner(System.in);
        
        for (;;) {
        System.out.print("Masukkan nilai kuis: ");
        kuis = input.nextDouble();
            
            // Jika nilai valid, keluar dari loop
            if (kuis >= 0 && kuis <= 100) {
                break;
            } else {
            // Jika nilai tidak valid, berikan peringatan
                System.out.println("Nilai harus di antara 0 dan 100. Silakan coba lagi.\n");
                return;
            }
        }

        for (;;) {
            System.out.print("Masukkan nilai UAS: ");
            uas = input.nextDouble();
            if (uas >= 0 && uas <= 100) {
                break; // Jika nilai valid, keluar dari loop
            } else {
                System.out.println("Nilai harus di antara 0 dan 100. Silakan coba lagi.\n");
                return;
            }
        }

        for(;;){
        System.out.print("Masukkan nilai tugas: ");
        tugas = input.nextDouble();
       
        if(tugas >=0 && tugas <= 100){
            break;
        }else {
            System.out.println("Niali harus di antara 0 dan 100. Silahkan coba lagi.\n");
            return;
        }}

        if(kuis>uas){
            akhir = ((0.4*kuis)+(0.4*uas)+(0.2*tugas));
        }else{
            akhir = ((0.3*kuis)+(0.5*uas)+(0.2*tugas));
        }
        if(akhir>=85 && akhir<=100){
            bobot = 4;
            huruf = "A";
            ket = "Sangat baik";
        }else if(akhir>=75 && akhir<=84){
            bobot = 3;
            huruf = "B";
            ket = "Baik";
        }else if(akhir>=65 && akhir<=74){
            bobot = 2;
            huruf = "C";
            ket = "Cukup";
        }else if(akhir>=50 && akhir<=64){
            bobot = 1;
            huruf = "D";
            ket = "Kurang";
        }else if(akhir>=0 && akhir<=49){
            bobot = 0;
            huruf = "E";
            ket = "Gagal";
        }
        System.out.printf("\n%s\n", "==============Hasil==============");
        System.out.printf("%s: %.2f", "Nilai akhir", akhir);
        System.out.printf("\n%s: %d\n", "Bobot", bobot);
        System.out.printf("%s: %s\n", "Nilai Huruf", huruf);
        System.out.printf("%s: %s\n", "Keterangan", ket);
        System.out.printf("%s\n\n", "==================================");
    }
}