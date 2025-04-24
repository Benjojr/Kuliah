import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pekerja extends Manusia {
    private double gaji;
    private LocalDate tahunMasuk;
    private int jumlahAnak;

    public Pekerja(String nama, String nik, boolean jenisKelamin, boolean menikah, double gaji, LocalDate tahunMasuk,
            int jumlahAnak) {
        super(nama, nik, jenisKelamin, menikah);
        this.gaji = gaji;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    private long getLamaBekerja() {
        return ChronoUnit.YEARS.between(tahunMasuk, LocalDate.now());
    }

    public double getBonus() {
        double bonus = 0;
        if (getLamaBekerja() <= 5)
            bonus = 0.05 * gaji;
        else if (getLamaBekerja() > 5 && getLamaBekerja() <= 10)
            bonus = 0.1 * gaji;
        else if (getLamaBekerja() > 10)
            bonus = 0.15 * gaji;

        
        return bonus;
    }

    public double getGaji(){
        return gaji;
    }

    @Override
    public double getTunjangan(){
        if (jumlahAnak > 0)
            return super.getTunjangan()+(jumlahAnak * 20);
        else 
            return 0;
        
    }

    @Override
    public double getPendapatan() {
        return getGaji()+getTunjangan()+getBonus(); 
    } 

    @Override
    public String toString() {
        return super.toString() + "\ntahun masuk\t: " + tahunMasuk + "\njumlah anak\t: " + jumlahAnak + "\ngaji\t\t: " + gaji;
    }
}
