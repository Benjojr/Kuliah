public class main {
    public static void main(String[] args) {
        departemen departemenTI = new departemen("Teknik Informatika", "Gedung A");

        dosen dosen1 = new dosen("Dr. Ahmad", "12345");
        dosen dosen2 = new dosen("Prof. Budi", "67890");

        departemenTI.tambahDosen(dosen1);
        departemenTI.tambahDosen(dosen2);

        departemenTI.tampilkanDosen();

        dosen1.mengajar();
        dosen2.mengajar();

        departemenTI.hapusDosen(dosen1);
        departemenTI.tampilkanDosen();

        dosen1.mengajar();


    }
}
