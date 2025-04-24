public class Dosen implements Teacher{
    int NIP;
    String Nama;
    String MK;
    
    public Dosen(int NIP, String Nama, String MK){
        this.NIP = NIP;
        this.Nama = Nama;
        this.MK = MK;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setMK(String MK) {
        this.MK = MK;
    }

    public int getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public String getMK() {
        return MK;
    }

    @Override
    public void teaching() {
        System.out.println(Nama+" Mengajar MK "+MK);
    }

    @Override
    public void correcting() {
        System.out.println(Nama+" Koreksi MK "+MK);
    }
}
