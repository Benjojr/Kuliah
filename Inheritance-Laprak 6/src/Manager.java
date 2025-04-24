import java.time.LocalDate;
public class Manager extends Pekerja{
    private String departemen;

    public Manager(String nama, String nik, boolean jenisKelamin, boolean menikah, double gaji, LocalDate tahunMasuk, int jumlahAnak, String departemen) {
        super(nama, nik, jenisKelamin, menikah, gaji, tahunMasuk, jumlahAnak);
        this.departemen = departemen;
    }

    @Override
    public double getTunjangan(){
        return super.getTunjangan()+(0.1*super.getGaji());
    }

    

    @Override
    public String toString() {
        return super.toString() + "\ndepartemen\t: " + departemen;
    }
}