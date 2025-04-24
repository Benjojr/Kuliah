public class Dosen {
    private int nip;
    private String nama;
    private String penelitian;

    public Dosen(String nipInput, String nama, String penelitian){
        try {
            this.nip = Integer.parseInt(nipInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("NIP tidak boleh alfabet atau kosong");
        }
        if(nama.isEmpty()){
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }else{
            this.nama = nama;
        }
        
        this.penelitian = penelitian;
    }

    public int getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getPenelitian(){
        return penelitian;
    }

    @Override
    public String toString() {
        return "("+nip+", "+nama+", "+penelitian+")";
    }
}
