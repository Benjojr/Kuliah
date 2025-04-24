import java.util.ArrayList;
import java.util.List;
public class Nasabah{
    private String nama;
    private String id;
    private String kontak;
    private List<Rekening> rekeningList = new ArrayList<Rekening>();

    public Nasabah(String nama, String id, String kontak){
        this.nama = nama;
        this.id = id;
        this.kontak = kontak;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getKontak(){
        return kontak;
    }

    public void setKontak(String kontak){
        this.kontak = kontak;
    }

    public void addRekening(Rekening rekening){
        rekeningList.add(rekening);
    }

    public List<Rekening> getRekeningList(){
        return rekeningList;
    }

    @Override
    public String toString() {
        return "Nasabah{" +
                "nama='" + nama + '\'' +
                ", id='" + id + '\'' +
                ", kontak='" + kontak + '\'' +
                ", rekeningList=" + rekeningList +
                '}';
    }
}