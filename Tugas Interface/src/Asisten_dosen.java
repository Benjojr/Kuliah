public class Asisten_dosen implements Teacher, Student {
    String nama;
    String MK_Prak;
    String KD_Asisten;

    public Asisten_dosen(String nama, String MK_Prak) {
        this.nama = nama;
        this.MK_Prak = MK_Prak;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setMK_Prak(String MK_Prak) {
        this.MK_Prak = MK_Prak;
    }

    public String getNama() {
        return nama;
    }

    public String getMK_Prak() {
        return MK_Prak;
    }

    @Override
    public void study() {
        System.out.println(nama+" Belajar Aturan Lab");
    }

    @Override
    public void submit() {
        System.out.println(nama+" Kumpul Presensi "+MK_Prak);
    }

    @Override
    public void teaching() {
        System.out.println(nama+" Mengajar Prak "+MK_Prak);
    }

    @Override
    public void correcting() {
        System.out.println(nama+" Koreksi Prak "+MK_Prak);
    }
}
