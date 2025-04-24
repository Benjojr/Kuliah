public class Mahasiswa implements Student {
    int NIM;
    String Nama;

    public Mahasiswa(int NIM, String Nama) {
        this.NIM = NIM;
        this.Nama = Nama;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getNIM() {
        return NIM;
    }

    public String getNama() {    
        return Nama;
    }

    public void study() {
        System.out.println(Nama+" Belajar MK");
    }

    public void submit() {
        System.out.println(Nama+" Kumpul Tugas");
    }
}
