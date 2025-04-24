import java.util.ArrayList;
import java.util.List;

public class departemen {
    private String nama;
    private String lokasi;    
    private List<dosen> dosens;

    public departemen(String nama, String lokasi){
        this.nama = nama;
        this.lokasi = lokasi;
        this.dosens = new ArrayList<>();
    }

    public String getNama(){
        return nama;
    }

    public String getLokasi(){
        return lokasi;
    }

    public void tambahDosen(dosen dosen){
        dosens.add(dosen);
        dosen.setDepartemen(this);
    }

    public void hapusDosen(dosen dosen){
        dosens.remove(dosen);
        dosen.setDepartemen(null);
    }

    public void tampilkanDosen(){
        System.out.println("Dosen di Departemen "+nama+":");
        for(dosen dosen : dosens){
            System.out.println("- "+dosen.getNama()+" (NIP: "+dosen.getNip()+")");
        }
    }



}
