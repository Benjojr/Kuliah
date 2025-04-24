import java.util.Scanner;
public class MainStudent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah siswa: ");
        int jmlh = input.nextInt();
        Student[] student = new Student[jmlh];

        for(int i=0; i<jmlh;i++){
            input.nextLine();
            System.out.println("========MAHASISWA "+(i+1)+"========");
            System.out.print("Nama\t\t\t: ");
            String nama = input.nextLine();
            System.out.print("Alamat\t\t\t: ");
            String alamat = input.nextLine();
            System.out.print("Usia\t\t\t: ");
            int usia = input.nextInt();
            System.out.print("Nilai matematika\t: ");
            int nilai_mtk = input.nextInt();
            System.out.print("Nilai bahasa inggris\t: ");
            int nilai_english = input.nextInt();
            System.out.print("Nilai IPA\t\t: ");
            int nilai_science = input.nextInt();
            System.out.println("===========================");
            student[i] = new Student();
            student[i].setName(nama);
            student[i].setAddress(alamat);
            student[i].setAge(usia);
            student[i].setMath(nilai_mtk);
            student[i].setEnglish(nilai_english);
            student[i].setScience(nilai_science);
        }

        for(int i=0;i<student.length;i++){
            System.out.println("====================");
            student[i].displayMessage();
            System.out.println("====================");
        }
        Student cek_objek = new Student();
        cek_objek.jumlahObjek();
    }
}
