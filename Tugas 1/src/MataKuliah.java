public class MataKuliah {
    private String kodeMataKuliah;
    private String namaMataKuliah;
    private int sks;

    public MataKuliah(String kodeMataKuliah, String namaMataKuliah, int sks) {
        if (kodeMataKuliah.length() > 8)
            throw new IllegalArgumentException("Kode MK melebihi 8 digit");
        else
            this.kodeMataKuliah = kodeMataKuliah;
        if (namaMataKuliah.isEmpty())
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        else
            this.namaMataKuliah = namaMataKuliah;

        this.sks = sks;
    }

    public String getKodeMatkul() {
        return kodeMataKuliah;
    }

    public String getNamaMatkul() {
        return namaMataKuliah;
    }

    public int getSks() {
        return sks;
    }

    @Override
    public String toString() {
        return "(" + kodeMataKuliah + ", " + namaMataKuliah + ", " + sks + ")";
    }
}
