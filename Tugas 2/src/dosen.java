public class dosen {
    private String nama;
    private String nip;
    private departemen dep;
    
    public dosen(String nama, String nip){
        this.nama = nama;
        this.nip = nip;
        this.dep = null;
    }

    public String getNama(){
        return nama;
    }

    public String getNip(){
        return nip;
    }

    public departemen getDepartemen(){
        return dep;
    }

    public void setDepartemen(departemen dep){
        this.dep = dep;
    }

    public void mengajar(){
        System.out.println(nama+" sedang mengajar di Departemen "+(dep != null? dep.getNama() : "tidak deketahui"));
    }
}
