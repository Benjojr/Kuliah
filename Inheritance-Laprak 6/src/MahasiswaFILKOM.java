public class MahasiswaFILKOM extends Manusia {
    private String nim;
    private double ipk;

    public MahasiswaFILKOM(String nama, String nik, boolean jenisKelamin, boolean menikah, String nim, double ipk) {
        super(nama, nik, jenisKelamin, menikah);
        this.nim = nim;
        this.ipk = ipk;
    }

    public double getBeasiswa(double ipk) {
        if (ipk > 3.0 && ipk <= 3.5) {
            return 50;
        } else {
            return 75;
        }
    }

    public String getStatus(String nim) {
        String angkatan = "20" + nim.substring(0, 2);
        char digitProdi = nim.charAt(6);
        String prodi="";
        switch (digitProdi) {
            case '2':
                prodi = "Teknik Informatika";
                break;
            case '3':
                prodi = "Teknik Komputer";
                break;
            case '4':
                prodi = "Sistem Informasi";
                break;
            case '6':
                prodi = "Pendidikan Teknologi Informasi";
                break;
            case '7':
                prodi = "Teknologi Informasi";
                break;
        }
        return prodi + ", "+angkatan;
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + getBeasiswa(ipk);
    }

    @Override
    public String toString() {
        return super.toString() + "\nnim\t\t: " + nim + "\nipk\t\t: " + ipk + "\nstatus\t\t: " + getStatus(nim);
    }

}
