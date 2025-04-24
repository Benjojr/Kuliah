class mahasiswa {
    private String nim;
    public String nama;
    public mahasiswa(){
        System.out.println("Satu objek mahasiswa sedang dibuat");
    }

    public mahasiswa(String nim, String nama){
        this.nim = nim;
        this.nama = nama;
    }

    public mahasiswa(String str_nim){
        nim = str_nim;
    }
    
    public String puqi(){
        return nim;
    }

    public void set(String asu){
        nama = asu;
    }
}
