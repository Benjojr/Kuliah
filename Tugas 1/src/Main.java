public class Main {
    public static void main(String[] args) {
        try {
            Dosen Dosen1 = new Dosen("222", "Pak Y", "Deep heart");
            Dosen Dosen2 = new Dosen("222", "", "Deep Sea");
            MataKuliah MK1 = new MataKuliah("C12345678", "Pemrograman Lanjut", 5);
            MataKuliah MK2 = new MataKuliah("C1234567", "", 5);
            Ruangan Ruangan1 = new Ruangan("F26", "F2.6", 'Z');

            System.out.println("Dosen1 " + Dosen1);
            System.out.println("Dosen2 " + Dosen2);
            System.out.println("MK1 " + MK1);
            System.out.println("MK2 " + MK2);
            System.out.println("Ruangan" + Ruangan1.getKodeRuangan() + " " + Ruangan1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}