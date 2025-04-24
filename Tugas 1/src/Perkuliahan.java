public class Perkuliahan {
    private String kodePK;
    private char kelas;
    private Dosen dosen;
    private Ruangan ruangan;
    private MataKuliah matkul;
    private String materi;
    private String tanggal;

    public Perkuliahan(String kodePK, MataKuliah matkul, char kelas, String materi, String tanggal, Dosen dosen, Ruangan ruangan){
        this.kodePK = kodePK;
        this.matkul = matkul;
        this.kelas = kelas;
        this.materi = materi;
        this.tanggal = tanggal;
        this.dosen = dosen;
        this.ruangan = ruangan;
    }

    public String getKodePK(){
        return kodePK;
    }

    public MataKuliah getMatkul(){
        return matkul;
    }

    public char getKelas(){
        return kelas;
    }

    public String getMateri(){
        return materi;
    }

    public String getTanggal(){
        return tanggal;
    }

    public Dosen getDosen(){
        return dosen;
    }

    public Ruangan getRuangan(){
        return ruangan;
    }

    @Override
    public String toString(){
        return "("+kodePK+", "+matkul.getNamaMatkul()+", "+materi+", "+kelas+", "+tanggal+", "+dosen.getNama()+", "+ruangan.getNamaRuangan()+")";
    }
}
